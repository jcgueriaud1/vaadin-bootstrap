package org.vaadin.boostrapcss.demo;

import com.vaadin.flow.router.RouterLink;
import org.vaadin.boostrapcss.components.BsNavBar;
import org.vaadin.boostrapcss.documentation.components.AlertExample;
import org.vaadin.boostrapcss.documentation.components.BadgeExample;
import org.vaadin.boostrapcss.documentation.components.BreadcrumbExample;
import org.vaadin.boostrapcss.documentation.components.ButtonExample;
import org.vaadin.boostrapcss.documentation.components.ButtonGroupExample;
import org.vaadin.boostrapcss.documentation.components.CardExample;
import org.vaadin.boostrapcss.documentation.components.CollapseExample;
import org.vaadin.boostrapcss.documentation.components.DropdownExample;
import org.vaadin.boostrapcss.documentation.components.FormExample;
import org.vaadin.boostrapcss.documentation.components.ListGroupExample;
import org.vaadin.boostrapcss.documentation.components.NavBarExample;
import org.vaadin.boostrapcss.documentation.layout.GridExample;
import org.vaadin.boostrapcss.documentation.utilities.BorderExample;
import org.vaadin.boostrapcss.documentation.utilities.ColorExample;
import org.vaadin.boostrapcss.documentation.utilities.DisplayExample;
import org.vaadin.boostrapcss.documentation.utilities.SpacingExample;
import org.vaadin.boostrapcss.enums.BsColor;


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
