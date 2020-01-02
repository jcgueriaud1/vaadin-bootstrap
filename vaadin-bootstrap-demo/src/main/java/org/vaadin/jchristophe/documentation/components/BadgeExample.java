package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsBadge;

@Route(value ="badge")
public class BadgeExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createBadges();
        createBadgesPill();
    }

    public void createBadges() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for badge");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Basic Example
        layout.add(new BsBadge("Primary").withPrimary());
        layout.add(new BsBadge("Secondary").withSecondary());
        layout.add(new BsBadge("Success").withSuccess());
        layout.add(new BsBadge("Danger").withDanger());
        layout.add(new BsBadge("Warning").withWarning());
        layout.add(new BsBadge("Info").withInfo());
        layout.add(new BsBadge("Light").withLight());
        layout.add(new BsBadge("Dark").withDark());
        // end-source-example

        addCard("Basic Example", layout, message);

    }

    private void createBadgesPill() {
        Div message = createMessageDiv("pill-message");
        message.setText("Pill badge");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Pill Example
        layout.add(new BsBadge("Primary").withPrimary().withPill());
        layout.add(new BsBadge("Secondary").withSecondary().withPill());
        layout.add(new BsBadge("Success").withSuccess().withPill());
        layout.add(new BsBadge("Danger").withDanger().withPill());
        layout.add(new BsBadge("Warning").withWarning().withPill());
        layout.add(new BsBadge("Info").withInfo().withPill());
        layout.add(new BsBadge("Light").withLight().withPill());
        layout.add(new BsBadge("Dark").withDark().withPill());
        // end-source-example

        addCard("Pill Example", layout, message);
    }
}
