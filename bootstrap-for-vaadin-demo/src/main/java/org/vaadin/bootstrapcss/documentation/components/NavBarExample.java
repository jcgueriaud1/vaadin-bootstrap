package org.vaadin.bootstrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.bootstrapcss.components.BsNavBar;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;
import org.vaadin.bootstrapcss.enums.BsColor;

@Route(value = NavBarExample.CURRENT_URL)
public class NavBarExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/navbar/";

    public NavBarExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
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
        BsNavBar navBar = new BsNavBar("mainNavExample").withNavBarDark().withBgColor(BsColor.DARK);
        navBar.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        navBar.addNavLink(new RouterLink("Card", CardExample.class));
        navBar.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        navBar.withNavBrandText("Example nav");
        // end-source-example

        addCodeExample("Basic Example", navBar, message);
    }

}
