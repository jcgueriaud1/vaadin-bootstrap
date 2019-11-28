package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.BootstrapLayout;
import org.vaadin.jchristophe.bootstrap.components.BsButton;

@Route(value ="button", layout = BootstrapLayout.class)
public class ButtonExample extends Div {

    public ButtonExample() {
        add(new BsButton("Primary").withPrimary());
        add(new BsButton("Secondary").withSecondary());
        add(new BsButton("Success").withSuccess());
        add(new BsButton("Danger").withDanger());
        add(new BsButton("Warning").withWarning());
        add(new BsButton("Info").withInfo());
        add(new BsButton("Light").withLight());
        add(new BsButton("Dark").withDark());
        add(new BsButton("Link").withLink());
        addButtonsOutline();
        addButtonsSize();
    }

    private void addButtonsOutline() {
        add(new BsButton("Primary").withOutlinePrimary());
        add(new BsButton("Secondary").withOutlineSecondary());
        add(new BsButton("Success").withOutlineSuccess());
        add(new BsButton("Danger").withOutlineDanger());
        add(new BsButton("Warning").withOutlineWarning());
        add(new BsButton("Info").withOutlineInfo());
        add(new BsButton("Light").withOutlineLight());
        add(new BsButton("Dark").withOutlineDark());
    }

    private void addButtonsSize() {
        add(new BsButton("Lg").withPrimary().withLg());
        add(new BsButton("Sm").withPrimary().withSm());
    }
}
