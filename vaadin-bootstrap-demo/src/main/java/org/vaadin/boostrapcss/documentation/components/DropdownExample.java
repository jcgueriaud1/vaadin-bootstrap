package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.components.BsDropdownMenu;
import org.vaadin.boostrapcss.demo.BsDemoView;
import org.vaadin.boostrapcss.enums.BsColor;

@Route(value = DropdownExample.CURRENT_URL)
public class DropdownExample extends BsDemoView {

    public static final String CURRENT_URL = "components/dropdowns/";

    public DropdownExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createSingleButtonExample();
        createDropdownMenuWithDividerExample();
    }

    private void createSingleButtonExample() {
        Div message = createMessageDiv("single-button");
        message.setText("Dropdowns are toggleable, contextual overlays for displaying lists of links and more. " +
                "They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering; ");
        // begin-source-example
        // source-example-heading: Single Button
        Div layout = new Div();
        BsButton button = new BsButton("Dropdown button").withColor(BsColor.PRIMARY);
        layout.add(button);
        BsDropdownMenu dropdownMenu = new BsDropdownMenu();
        dropdownMenu.addAction(new Span("Dummy action 1"),new Span("Dummy action 2"),new Span("Dummy action 3"));
        dropdownMenu.attachToComponent(button);
        layout.add(dropdownMenu);
        // end-source-example

        addCodeExample("Single Button", layout, message);
    }

    private void createDropdownMenuWithDividerExample() {
        Div message = createMessageDiv("dropdownmenu-divider");
        message.setText("Separate groups of related menu items with a divider. Add a header to label sections of actions in any dropdown menu.");
        // begin-source-example
        // source-example-heading: Headers and Dividers
        Div layout = new Div();
        BsButton button = new BsButton("Dropdown button with header").withColor(BsColor.SUCCESS);
        layout.add(button);
        BsDropdownMenu dropdownMenu = new BsDropdownMenu();
        dropdownMenu.addHeader(new H6("Header"));
        Span span = new Span("Action 1");
        span.addClickListener(event -> {
            Notification.show("Action 1 done !");
        });
        dropdownMenu.addAction(span);
        dropdownMenu.addDivider();
        Span span2 = new Span("Action 2");
        span2.addClickListener(event -> {
            Notification.show("Action 2 done !");
        });
        dropdownMenu.addAction(span2);
        dropdownMenu.attachToComponent(button);
        layout.add(dropdownMenu);
        // end-source-example

        addCodeExample("Single Button", layout, message);
    }
}
