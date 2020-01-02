package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.ListItem;
import org.vaadin.boostrapcss.mixins.HasBsColor;
import org.vaadin.boostrapcss.mixins.HasBsState;

public class BsListItem extends ListItem implements HasBsState<BsListItem>, HasBsColor<BsListItem> {

    public BsListItem() {
        super();
        addClassName(getDefaultClassName());
    }

    public BsListItem(String text) {
        this();
        setText(text);
    }

    @Override
    public String getDefaultClassName() {
        return "list-group-item";
    }
}
