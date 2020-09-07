package org.vaadin.bootstrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.bootstrapcss.components.BsBreadcrumb;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;
import org.vaadin.bootstrapcss.documentation.HomeExample;

@Route(value = BreadcrumbExample.CURRENT_URL)
public class BreadcrumbExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/breadcrumb/";

    public BreadcrumbExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createBreadcrumbs();
    }

    public void createBreadcrumbs() {
        Div message = createMessageDiv("breadcrumb-message");
        message.setText("Indicate the current page’s location within a navigational hierarchy that automatically adds separators via CSS.");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Examples
        BsBreadcrumb breadcrumb = new BsBreadcrumb();
        breadcrumb.setLinks(
                new RouterLink("Home", HomeExample.class),
                new RouterLink("Alerts", AlertExample.class),
                new RouterLink("Breadcrumbs", BreadcrumbExample.class));
        layout.add(breadcrumb);

        BsBreadcrumb breadcrumb2 = new BsBreadcrumb();
        breadcrumb2.setLinks(
                new RouterLink("Home", HomeExample.class),
                new RouterLink("Breadcrumbs", BreadcrumbExample.class));
        layout.add(breadcrumb2);

        BsBreadcrumb breadcrumb3 = new BsBreadcrumb();
        breadcrumb3.setLinks(
                new RouterLink("Home", HomeExample.class));
        layout.add(breadcrumb3);

        // end-source-example

        addCodeExample("Examples", layout, message);

    }

}
