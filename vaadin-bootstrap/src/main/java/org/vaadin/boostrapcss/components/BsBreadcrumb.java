package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.OrderedList;

public class BsBreadcrumb extends Nav {

    private OrderedList orderedList = new OrderedList();

    public BsBreadcrumb() {
        getElement().setAttribute("aria-label", "breadcrumb");
        add(orderedList);
    }
}
