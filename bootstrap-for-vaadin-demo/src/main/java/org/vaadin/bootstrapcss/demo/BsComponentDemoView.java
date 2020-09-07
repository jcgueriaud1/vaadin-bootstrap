package org.vaadin.bootstrapcss.demo;

import com.vaadin.flow.router.RouterLink;
import org.vaadin.bootstrapcss.components.BsNavBar;
import org.vaadin.bootstrapcss.documentation.components.AlertExample;
import org.vaadin.bootstrapcss.documentation.components.BadgeExample;
import org.vaadin.bootstrapcss.documentation.components.BreadcrumbExample;
import org.vaadin.bootstrapcss.documentation.components.ButtonExample;
import org.vaadin.bootstrapcss.documentation.components.ButtonGroupExample;
import org.vaadin.bootstrapcss.documentation.components.CardExample;
import org.vaadin.bootstrapcss.documentation.components.CollapseExample;
import org.vaadin.bootstrapcss.documentation.components.DropdownExample;
import org.vaadin.bootstrapcss.documentation.components.FormExample;
import org.vaadin.bootstrapcss.documentation.components.ListGroupExample;
import org.vaadin.bootstrapcss.documentation.components.NavBarExample;
import org.vaadin.bootstrapcss.documentation.layout.GridExample;
import org.vaadin.bootstrapcss.documentation.utilities.BorderExample;
import org.vaadin.bootstrapcss.documentation.utilities.ColorExample;
import org.vaadin.bootstrapcss.documentation.utilities.DisplayExample;
import org.vaadin.bootstrapcss.documentation.utilities.SpacingExample;
import org.vaadin.bootstrapcss.enums.BsColor;


public abstract class BsComponentDemoView extends BsDemoView {

    public BsComponentDemoView() {
        super();
    }

    public BsComponentDemoView(String bootstrapLink) {
        super(bootstrapLink);
    }

    protected void createSideBar() {
        sideNavigation = new BsNavBar("sideBar").withNavBarLight().withBgColor(BsColor.LIGHT);
        sideNavigation.addClassName("sideBar");
        sideNavigation.addNavLink(new RouterLink("Alerts", AlertExample.class));
        sideNavigation.addNavLink(new RouterLink("Badge", BadgeExample.class));
        sideNavigation.addNavLink(new RouterLink("Breadcrumb", BreadcrumbExample.class));
        sideNavigation.addNavLink(new RouterLink("Buttons", ButtonExample.class));
        sideNavigation.addNavLink(new RouterLink("Button Group", ButtonGroupExample.class));
        sideNavigation.addNavLink(new RouterLink("Card", CardExample.class));
        sideNavigation.addNavLink(new RouterLink("Collapse", CollapseExample.class));
        sideNavigation.addNavLink(new RouterLink("Dropdown", DropdownExample.class));
        sideNavigation.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        sideNavigation.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        sideNavigation.addNavLink(new RouterLink("Form", FormExample.class));
        sideNavigation.addNavLink(new RouterLink("Grid", GridExample.class));
        sideNavigation.addNavLink(new RouterLink("Color", ColorExample.class));
        sideNavigation.addNavLink(new RouterLink("Spacing", SpacingExample.class));
        sideNavigation.addNavLink(new RouterLink("Display", DisplayExample.class));
        sideNavigation.addNavLink(new RouterLink("Borders", BorderExample.class));
        sideNavigation.withNavBrandText("Sub menu bar");
        add(sideNavigation);
    }
}
