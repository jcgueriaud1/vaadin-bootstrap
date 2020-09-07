package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.router.RouterLink;

public class BsBreadcrumb extends Nav {

    private static final String CSS_BREADCRUMB_NAME = "breadcrumb";
    private OrderedList orderedList = new OrderedList();


    public BsBreadcrumb() {
        getElement().setAttribute("aria-label", CSS_BREADCRUMB_NAME);
        add(orderedList);
        orderedList.addClassName(CSS_BREADCRUMB_NAME);
    }

    public void setLinks(RouterLink... links) {
        orderedList.removeAll();
        if (links.length > 0) {
            for (int i = 0; i < links.length - 1; i++) {
                ListItem listItem = new ListItem(links[i]);
                listItem.addClassName(CSS_BREADCRUMB_NAME + "-item");
                orderedList.add(listItem);
            }
            // add the last one as text
            ListItem listItem = new ListItem(links[links.length - 1].getText());
            listItem.addClassNames(CSS_BREADCRUMB_NAME + "-item", "active");
            orderedList.add(listItem);
        }
    }
}
