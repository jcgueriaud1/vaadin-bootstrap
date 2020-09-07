package org.vaadin.bootstrapcss.documentation.components;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.components.BsAlert;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;
import org.vaadin.bootstrapcss.enums.BsColor;

@Route(value = AlertExample.CURRENT_URL)
public class AlertExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/alerts/";

    public AlertExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createAlerts();
        createDimissibleAlert();
        createAlertWithTitle();
    }

    public void createAlerts() {
        Div message = createMessageDiv("alert-message");
        message.setText("Alerts are available for any length of text, as well as an optional dismiss button. For proper styling, use one of the eight required contextual classes");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Examples
        BsAlert alertPrimary = new BsAlert().withColor(BsColor.PRIMARY);
        alertPrimary.addContent(new Span("A simple primary alert—check it out!"));
        layout.add(alertPrimary);
        BsAlert alertSecondary = new BsAlert().withColor(BsColor.SECONDARY);
        alertSecondary.addContent(new Span("A simple secondary alert—check it out!"));
        layout.add(alertSecondary);
        BsAlert alertSuccess = new BsAlert().withColor(BsColor.SUCCESS);
        alertSuccess.addContent(new Span("A simple success alert—check it out!"));
        layout.add(alertSuccess);
        BsAlert alertDanger = new BsAlert().withColor(BsColor.DANGER);
        alertDanger.addContent(new Span("A simple danger alert—check it out!"));
        layout.add(alertDanger);
        BsAlert alertWarning = new BsAlert().withColor(BsColor.WARNING);
        alertWarning.addContent(new Span("A simple warning alert—check it out!"));
        layout.add(alertWarning);
        BsAlert alertInfo = new BsAlert().withColor(BsColor.INFO);
        alertInfo.addContent(new Span("A simple info alert—check it out!"));
        layout.add(alertInfo);
        BsAlert alertLight = new BsAlert().withColor(BsColor.LIGHT);
        alertLight.addContent(new Span("A simple light alert—check it out!"));
        layout.add(alertLight);
        BsAlert alertDark = new BsAlert().withColor(BsColor.DARK);
        alertDark.addContent(new Span("A simple dark alert—check it out!"));
        layout.add(alertDark);
        // end-source-example

        addCodeExample("Examples", layout, message);

    }

    public void createDimissibleAlert() {
        Div message = createMessageDiv("alert-dimissible");
        message.setText("Alerts are available for any length of text, as well as an optional dismiss button.");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Dimissible alerts
        BsAlert alertPrimary = new BsAlert().withColor(BsColor.PRIMARY);
        alertPrimary.setDismissible();
        alertPrimary.addContent(new Span("A simple primary alert—check it out!"));
        layout.add(alertPrimary);
        BsAlert alertDanger = new BsAlert().withColor(BsColor.DANGER);
        alertDanger.setDismissible();
        alertDanger.addContent(new Html("<span>A simple danger alert with <a class=\"alert-link\">an example link</a>.</span>"));
        layout.add(alertDanger);
        // end-source-example

        addCodeExample("Dimissible alerts", layout, message);

    }

    public void createAlertWithTitle() {
        Div message = createMessageDiv("alert-title");
        message.setText("Alerts can also contain additional HTML elements like headings, paragraphs and dividers. Heading has been added in the java class");
        Div layout = new Div();
        // begin-source-example
        // source-example-heading: Alert with title
        BsAlert alertPrimary = new BsAlert().withColor(BsColor.PRIMARY);
        alertPrimary.setHeaderText("Alert Title");
        alertPrimary.addContent(new Span("A simple primary alert—check it out!"));
        layout.add(alertPrimary);
        // end-source-example

        addCodeExample("Alert with title", layout, message);

    }

}
