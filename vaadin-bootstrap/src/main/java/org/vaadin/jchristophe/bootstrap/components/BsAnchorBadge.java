package org.vaadin.jchristophe.bootstrap.components;

import com.vaadin.flow.component.html.Anchor;
import org.vaadin.jchristophe.bootstrap.utils.HasBsColor;

public class BsAnchorBadge extends Anchor implements HasBsColor<BsAnchorBadge> {

    private String defaultClassName = "badge";

    public BsAnchorBadge() {
        addClassName(defaultClassName);
    }

    public BsAnchorBadge(String text) {
        this();
        setText(text);
    }

    @Override
    public String getDefaultClassName() {
        return defaultClassName;
    }

    public BsAnchorBadge withPill() {
        addClassName(getDefaultClassName() + "-pill");
        return this;
    }
}
