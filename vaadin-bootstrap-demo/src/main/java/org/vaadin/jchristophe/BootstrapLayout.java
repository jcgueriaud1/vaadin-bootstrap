package org.vaadin.jchristophe;


import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;


@StyleSheet("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/css/coreui.min.css")
@JavaScript("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/js/coreui.min.js")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js")

/*
@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css")
@JavaScript("https://code.jquery.com/jquery-3.4.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js")*/
@CssImport("./bootstrap-to-lumo-variables.css")
public class BootstrapLayout extends Div implements RouterLayout {
}
