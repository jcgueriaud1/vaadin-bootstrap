package org.vaadin.jchristophe.bootstrap.components;

import com.vaadin.flow.component.html.ListItem;
import org.vaadin.jchristophe.bootstrap.utils.HasBsColor;
import org.vaadin.jchristophe.bootstrap.utils.HasBsState;

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
