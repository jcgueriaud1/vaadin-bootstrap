package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.BootstrapLayout;
import org.vaadin.jchristophe.bootstrap.components.BsBadge;

@Route(value ="badge", layout = BootstrapLayout.class)
public class BadgeExample extends Div {

    public BadgeExample() {
        add(new BsBadge("Primary").withPrimary());
        add(new BsBadge("Secondary").withSecondary());
        add(new BsBadge("Success").withSuccess());
        add(new BsBadge("Danger").withDanger());
        add(new BsBadge("Warning").withWarning());
        add(new BsBadge("Info").withInfo());
        add(new BsBadge("Light").withLight());
        add(new BsBadge("Dark").withDark());
        addBadgesPill();

    }

    private void addBadgesPill() {
        add(new BsBadge("Primary").withPrimary().withPill());
        add(new BsBadge("Secondary").withSecondary().withPill());
        add(new BsBadge("Success").withSuccess().withPill());
        add(new BsBadge("Danger").withDanger().withPill());
        add(new BsBadge("Warning").withWarning().withPill());
        add(new BsBadge("Info").withInfo().withPill());
        add(new BsBadge("Light").withLight().withPill());
        add(new BsBadge("Dark").withDark().withPill());
    }
}
