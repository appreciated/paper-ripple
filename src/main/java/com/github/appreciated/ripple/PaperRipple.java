package com.github.appreciated.ripple;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("paper-ripple")
@NpmPackage(value = "@polymer/paper-ripple",version = "3.0.1")
@JsModule("@polymer/paper-ripple/paper-ripple.js")
/**
 * This Component can be used to add a "ripple" (ink ripple) click effect to a component.
 */
public class PaperRipple extends Component {

    public PaperRipple() {
        this(false, false, false);
    }

    public PaperRipple(boolean circle, boolean recenters, boolean noink) {
        setCircle(circle);
        setRecenters(recenters);
        setNoInk(noink);
        setColor("var(--lumo-primary-color)");
    }

    public void setNoInk(boolean noink) {
        getElement().setAttribute("noink", noink);
    }

    public void setRecenters(boolean recenters) {
        getElement().setAttribute("recenters", recenters);
    }

    public void setCircle(boolean circle) {
        getElement().getClassList().set("circle", circle);
    }

    public void setColor(String color) {
        getElement().getStyle().set("color", color);
    }

}
