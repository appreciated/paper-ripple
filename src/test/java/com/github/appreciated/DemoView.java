package com.github.appreciated;

import com.github.appreciated.ripple.PaperRippleDiv;
import com.github.appreciated.ripple.PaperRippleHorizontalLayout;
import com.github.appreciated.ripple.PaperRippleVerticalLayout;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        PaperRippleDiv div = new PaperRippleDiv();
        div.getElement().getStyle()
                .set("border", "1px solid black")
                .set("width", "300px")
                .set("height", "50px");
        div.addClickListener(clickEvent -> {/* Div was clicked */});

        PaperRippleHorizontalLayout hl = new PaperRippleHorizontalLayout();
        hl.getElement().getStyle()
                .set("border", "1px solid black")
                .set("width", "300px")
                .set("height", "50px");
        hl.addClickListener(clickEvent -> {/* HorizontalLayout was clicked */});

        PaperRippleVerticalLayout vl = new PaperRippleVerticalLayout();
        vl.getElement().getStyle()
                .set("border", "1px solid black")
                .set("width", "300px")
                .set("height", "50px");
        vl.addClickListener(clickEvent -> {/* VerticalLayout was clicked */});

        add(div, hl, vl);
        setAlignItems(Alignment.CENTER);
    }

    Component getLayout(Component component) {
        if (component instanceof HasComponents) {
            ((HasComponents) component).add(new Label("Test"));
        }
        if (component instanceof ClickNotifier) {
            ((ClickNotifier) component).addClickListener(clickEvent -> Notification.show("clicked!"));
        }
        component.getElement().getStyle()
                .set("border", "1px solid black")
                .set("width", "300px")
                .set("height", "50px");
        return component;
    }
}
