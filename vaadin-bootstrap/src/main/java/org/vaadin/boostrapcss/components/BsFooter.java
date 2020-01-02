package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.Footer;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;

public class BsFooter extends Footer implements HasBsBgColor<BsFooter> {

    private String defaultClassName = "footer";

    public BsFooter() {
        addClassName(defaultClassName);
    }

    public BsFooter withStickyTop() {
        addClassName("sticky-top");
        return this;
    }

    public BsFooter withFixedBottom() {
        addClassName("fixed-bottom");
        return this;
    }

    public BsFooter withFixedTop() {
        addClassName("fixed-top");
        return this;
    }
}
