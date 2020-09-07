package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Span;
import org.vaadin.bootstrapcss.mixins.HasBsOutlineColor;
import org.vaadin.bootstrapcss.mixins.HasBsSizeTheme;
import org.vaadin.bootstrapcss.mixins.HasBsColor;

public class BsButton extends NativeButton implements HasBsColor<BsButton>, HasBsSizeTheme<BsButton>, HasBsOutlineColor<BsButton> {

    private final static String defaultClassName = "btn";

    public BsButton() {
        addClassName(defaultClassName);
    }

    public BsButton(String text) {
        this();
        setText(text);
    }

    /**
     * Create a button with a suffixed badge
     * @param text
     * @param badge
     */
    public BsButton(String text, BsBadge badge) {
        this();
        add(new Span(text));
        // add space between text and badge
        add(new Span(" "));
        add(badge);
    }
    @Override
    public String getDefaultClassName() {
        return defaultClassName;
    }

    public BsButton withLink() {
        addClassName(getDefaultClassName() + "-lnk");
        return this;
    }

    public BsButton withActive() {
        addClassName("active");
        return this;
    }
}
