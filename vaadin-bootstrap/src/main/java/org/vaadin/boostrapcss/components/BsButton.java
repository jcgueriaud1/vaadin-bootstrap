package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.NativeButton;
import org.vaadin.boostrapcss.mixins.HasBsOutlineColor;
import org.vaadin.boostrapcss.mixins.HasBsSizeTheme;
import org.vaadin.boostrapcss.mixins.HasBsColor;

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
