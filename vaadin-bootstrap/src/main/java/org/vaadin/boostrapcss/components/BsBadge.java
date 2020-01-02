package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.Span;
import org.vaadin.boostrapcss.mixins.HasBsColor;

public class BsBadge extends Span implements HasBsColor<BsBadge> {

    private String defaultClassName = "badge";

    public BsBadge() {
        addClassName(defaultClassName);
    }

    public BsBadge(String text) {
        this();
        setText(text);
    }

    @Override
    public String getDefaultClassName() {
        return defaultClassName;
    }

    public BsBadge withPill() {
        addClassName(getDefaultClassName() + "-pill");
        return this;
    }
}
