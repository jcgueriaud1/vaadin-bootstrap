package org.vaadin.jchristophe.bootstrap.components;

import com.vaadin.flow.component.html.NativeButton;
import org.vaadin.jchristophe.bootstrap.mixins.HasBsOutlineColor;
import org.vaadin.jchristophe.bootstrap.mixins.HasBsSizeTheme;
import org.vaadin.jchristophe.bootstrap.mixins.HasBsColor;

public class BsButton extends NativeButton implements HasBsColor<BsButton>, HasBsSizeTheme<BsButton>, HasBsOutlineColor<BsButton> {

    private String defaultClassName = "btn";

    public BsButton() {
        addClassName(defaultClassName);
    }

    public BsButton(String text) {
        this();
        setText(text);
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
