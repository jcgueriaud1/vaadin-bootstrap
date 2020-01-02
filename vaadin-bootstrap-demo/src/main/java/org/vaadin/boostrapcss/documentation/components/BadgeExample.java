package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsBadge;
import org.vaadin.boostrapcss.demo.BsDemoView;

@Route(value = BadgeExample.CURRENT_URL)
public class BadgeExample extends BsDemoView {

    public static final String CURRENT_URL = "components/badge/";

    public BadgeExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

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

        addCodeExample("Basic Example", layout, message);

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

        addCodeExample("Pill Example", layout, message);
    }
}
