package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;

public class CollapsibleUtil {


    public static <T extends Component> void addCollapsible(ClickNotifier<T> collapser, HasStyle collapsible) {
        collapsible.getClassNames().add("collapse");
        collapser.addClickListener(e -> {
            collapsible.getElement().executeJs("$($0).collapse('toggle')");
        });
    }


    public static <T extends Component> void addAccordion(Component parent, ClickNotifier<T> collapser, HasStyle collapsible) {
        collapsible.getClassNames().add("collapse");
        collapser.addClickListener(e -> {
            collapsible.getElement().executeJs("$($0).collapse('toggle', $1 )", collapsible.getElement(), parent.getElement());
        });
    }
}
