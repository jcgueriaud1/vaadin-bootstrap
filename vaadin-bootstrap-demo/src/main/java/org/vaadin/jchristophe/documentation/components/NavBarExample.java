package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.components.BsNavBar;

@Route(value ="navBar")
public class NavBarExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
    }

    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for navBar");
        // begin-source-example
        // source-example-heading: Basic Example
        BsNavBar navBar = new BsNavBar("mainNavExample").withNavBarDark().withBgDark();
        navBar.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        navBar.addNavLink(new RouterLink("Card", CardExample.class));
        navBar.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        navBar.withNavBrandText("Example nav");
        // end-source-example

        addCard("Basic Example", navBar, message);
    }

}
