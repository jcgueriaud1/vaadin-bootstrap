package org.vaadin.boostrapcss;


import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;

import java.util.HashMap;

@StyleSheet("https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700")
@JavaScript("https://use.fontawesome.com/releases/v5.0.6/css/all.css")
@CssImport("./bootstrap-to-lumo-variables.css")
public class BootstrapLayout extends Div implements RouterLayout, PageConfigurator {
    @Override
    public void configurePage(InitialPageSettings settings) {
        addStylesheet(settings, "./assets/css/nucleo-icons.css");
        addStylesheet(settings, "./assets/css/nucleo-svg.css");
        addStylesheet(settings, "./assets/css/font-awesome.css");
        addStylesheet(settings, "./assets/css/argon-design-system.css?v=1.2.0");
        addJavascript(settings, "./assets/js/core/jquery.min.js");
        addJavascript(settings, "./assets/js/core/popper.min.js");
        addJavascript(settings, "./assets/js/core/bootstrap.min.js");
        addJavascript(settings, "./assets/js/plugins/perfect-scrollbar.jquery.min.js");
        addJavascript(settings, "./assets/js/plugins/bootstrap-switch.js");
        addJavascript(settings, "./assets/js/plugins/nouislider.min.js");
        addJavascript(settings, "./assets/js/plugins/moment.min.js");
        addJavascript(settings, "./assets/js/plugins/datetimepicker.js");
        addJavascript(settings, "./assets/js/plugins/bootstrap-datepicker.min.js");
        addJavascript(settings, "./assets/js/argon-design-system.min.js?v=1.2.0");
    }

    private void addStylesheet(InitialPageSettings settings, String stylesheet) {
        HashMap<String, String> attributes = new HashMap<>();
        attributes.put("rel", "stylesheet");
        attributes.put("type", "text/css");
        settings.addLink(stylesheet, attributes);

    }
    private void addJavascript(InitialPageSettings settings, String javascript) {
        settings.addInlineWithContents(
            "<script type=\"text/javascript\" defer=\"\" src=\"" +
                javascript +
                "\"></script>",  InitialPageSettings.WrapMode.NONE);

    }
}
