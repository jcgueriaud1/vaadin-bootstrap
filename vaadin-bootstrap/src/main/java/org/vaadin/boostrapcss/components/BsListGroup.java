package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.UnorderedList;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;
import org.vaadin.boostrapcss.mixins.HasBsHorizontal;
import org.vaadin.boostrapcss.mixins.HasBsTextColor;

public class BsListGroup extends UnorderedList implements HasBsBgColor<BsListGroup>, HasBsTextColor<BsListGroup>, HasBsHorizontal<BsListGroup> {

    public BsListGroup() {
        addClassName(getDefaultClassName());
    }

    public BsListGroup withFlush() {
        addClassName("list-group-flush");
        return this;
    }

    @Override
    public String getDefaultClassName() {
        return "list-group";
    }
}
