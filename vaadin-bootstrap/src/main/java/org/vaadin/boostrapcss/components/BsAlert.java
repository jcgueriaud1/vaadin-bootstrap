package org.vaadin.boostrapcss.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import org.vaadin.boostrapcss.mixins.HasBsColor;

public class BsAlert extends Div implements HasBsColor<BsAlert> {

    private final static String defaultClassName = "alert";
    private boolean dismissible = false;

    private H4 header = new H4();
    private Div content = new Div();

    public BsAlert() {
        getElement().setAttribute("role", defaultClassName);
        addClassName(defaultClassName);
        add(header);
        add(content);
        header.setVisible(false);
    }

    public BsAlert(Component... components) {
        this();
        add(components);
    }

    public void setHeaderText(String headerText) {
        header.addClassName(defaultClassName+ "-heading");
        header.setText(headerText);
        header.setVisible(true);
    }

    public void addContent(Component... components) {
        content.add(components);
    }

    @Override
    public String getDefaultClassName() {
        return defaultClassName;
    }

    public void setDismissible() {
        if (!dismissible) {
            dismissible = true;
            Html html = new Html("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
                    "    <span aria-hidden=\"true\">&times;</span>\n" +
                    "  </button>");
            add(html);
            addClassName(defaultClassName+ "-dismissible");
        }
    }
}
