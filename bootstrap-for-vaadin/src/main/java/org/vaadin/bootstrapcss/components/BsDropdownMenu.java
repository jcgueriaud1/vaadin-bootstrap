package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class BsDropdownMenu extends Div {

    private final static String DROPDOWN_CSS_NAME = "dropdown";

    public BsDropdownMenu() {
        getElement().setAttribute("role", DROPDOWN_CSS_NAME);
        addClassName(DROPDOWN_CSS_NAME + "-menu");
    }


    public void addAction(Component... actions) {
        for (Component action : actions) {
            action.getElement().getClassList().add(DROPDOWN_CSS_NAME + "-item");
        }
        add(actions);
    }

    public void addDivider() {
        Div divider = new Div();
        divider.addClassName(DROPDOWN_CSS_NAME + "-divider");
        add(divider);
    }
    public void addHeader(Component header) {
        header.getElement().getClassList().add(DROPDOWN_CSS_NAME + "-header");
        add(header);
    }

    /**
     * Link the dropdown menu to the component
     * Don't forget to add the dropdown menu to the layout after the component
     *
     * @param component
     */
    public void attachToComponent(Component component) {
        component.getElement().getClassList().add(DROPDOWN_CSS_NAME + "-toggle");
        component.getElement().setAttribute("data-toggle", DROPDOWN_CSS_NAME);
        component.getElement().setAttribute("aria-haspopup", "true");
        component.getElement().setAttribute("aria-expanded", "false");
    }
}
