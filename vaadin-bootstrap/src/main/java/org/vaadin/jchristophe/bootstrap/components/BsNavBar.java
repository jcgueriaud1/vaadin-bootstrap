package org.vaadin.jchristophe.bootstrap.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.jchristophe.bootstrap.utils.HasBsBgColor;
import org.vaadin.jchristophe.bootstrap.utils.HasBsColor;
import org.vaadin.jchristophe.bootstrap.utils.HasBsTextColor;

public class BsNavBar extends Nav implements HasBsColor<BsNavBar>, HasBsBgColor<BsNavBar> {

    private Anchor navBrand;
    private BsButton navToggler;
    private UnorderedList navBarNav;
    private BsDiv navBarCollapse;

    public BsNavBar(String id) {
        addClassName(getDefaultClassName());
        addClassName("navbar-expand-lg");
        add(navBrand = new Anchor());
        navBrand.addClassName("navbar-brand");
        add(navToggler = new BsButton());
        navToggler.getElement().setAttribute("data-toggle", "collapse");
        navToggler.getElement().setAttribute("aria-expanded", "false");
        navToggler.getElement().setAttribute("data-target", "#"+ id);
        navToggler.getElement().setAttribute("aria-controls", id);
        navToggler.addClassName("navbar-toggler");
        Span iconToggler = new Span();
        navToggler.add(iconToggler);
        iconToggler.addClassName("navbar-toggler-icon");
        add(navBarCollapse = new BsDiv());
        navBarCollapse.addClassNames("collapse", "navbar-collapse");
        navBarCollapse.setId(id);
        navBarCollapse.add(navBarNav = new UnorderedList());
        navBarNav.addClassName("navbar-nav");

    }

    public void addNavLink(RouterLink navLink) {
        ListItem item = new ListItem();
        item.addClassName("nav-item");
        navLink.addClassName("nav-link");
        item.add(navLink);
        navBarNav.add(item);
        navLink.setHighlightAction((obj, active) -> {
            if (active) {
                item.addClassName("active");
            } else {
                item.removeClassName("active");
            }
        });
    }

    public BsNavBar withNavBarLight() {
        addClassName("navbar-light");
        return this;
    }

    public BsNavBar withNavBarDark() {
        addClassName("navbar-dark");
        return this;
    }

    public BsNavBar withNavBrandText(String text) {
        navBrand.setText(text);
        return this;
    }

    @Override
    public String getDefaultClassName() {
        return "navbar";
    }
}
