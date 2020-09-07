package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.html.Div;

public class BsButtonGroup extends Div {

    private String defaultClassName = "btn-group";

    public BsButtonGroup() {
        addClassName(defaultClassName);
    }

    public BsButtonGroup withButton(BsButton button) {
        add(button);
        return this;
    }
}
