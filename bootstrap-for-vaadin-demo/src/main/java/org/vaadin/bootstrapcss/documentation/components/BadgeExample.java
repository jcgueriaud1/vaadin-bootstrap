package org.vaadin.bootstrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.components.BsBadge;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;
import org.vaadin.bootstrapcss.enums.BsColor;

@Route(value = BadgeExample.CURRENT_URL)
public class BadgeExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/badge/";

    public BadgeExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createBadges();
        createBadgesPill();
        createBadgeInButton();
    }

    public void createBadges() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for badge");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Basic Example
        layout.add(new BsBadge("Primary").withColor(BsColor.PRIMARY));
        layout.add(new BsBadge("Secondary").withColor(BsColor.SECONDARY));
        layout.add(new BsBadge("Success").withColor(BsColor.SUCCESS));
        layout.add(new BsBadge("Danger").withColor(BsColor.DANGER));
        layout.add(new BsBadge("Warning").withColor(BsColor.WARNING));
        layout.add(new BsBadge("Info").withColor(BsColor.INFO));
        layout.add(new BsBadge("Light").withColor(BsColor.LIGHT));
        layout.add(new BsBadge("Dark").withColor(BsColor.DARK));
        // end-source-example

        addCodeExample("Basic Example", layout, message);

    }

    private void createBadgesPill() {
        Div message = createMessageDiv("pill-message");
        message.setText("Pill badge");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Pill Example
        layout.add(new BsBadge("Primary").withColor(BsColor.PRIMARY).withPill());
        layout.add(new BsBadge("Secondary").withColor(BsColor.SECONDARY).withPill());
        layout.add(new BsBadge("Success").withColor(BsColor.SUCCESS).withPill());
        layout.add(new BsBadge("Danger").withColor(BsColor.DANGER).withPill());
        layout.add(new BsBadge("Warning").withColor(BsColor.WARNING).withPill());
        layout.add(new BsBadge("Info").withColor(BsColor.INFO).withPill());
        layout.add(new BsBadge("Light").withColor(BsColor.LIGHT).withPill());
        layout.add(new BsBadge("Dark").withColor(BsColor.DARK).withPill());
        // end-source-example

        addCodeExample("Pill Example", layout, message);
    }

    private void createBadgeInButton() {
        Div message = createMessageDiv("button-badge");
        message.setText("Badges can be used as part of buttons to provide a counter.");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Badge in a button
        BsBadge bsBadge = new BsBadge("4").withColor(BsColor.LIGHT);
        layout.add(new BsButton("Actions", bsBadge).withColor(BsColor.PRIMARY));
        // end-source-example

        addCodeExample("Badge in a button", layout, message);
    }

}
