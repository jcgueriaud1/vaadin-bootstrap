package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.html.Div;

public class BsButtonToolbar extends Div {

    private String defaultClassName = "btn-toolbar";

    public BsButtonToolbar() {
        addClassName(defaultClassName);
    }

    public BsButtonToolbar withButtonGroup(BsButtonGroup buttonGroup) {
        add(buttonGroup);
        return this;
    }
}
