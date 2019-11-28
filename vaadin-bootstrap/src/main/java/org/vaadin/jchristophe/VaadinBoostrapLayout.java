package org.vaadin.jchristophe;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.List;
import java.util.stream.Collectors;

@Tag("bootstrap")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "popper.js", version = "1.16.0")
@NpmPackage(value = "bootstrap", version = "4.4.1")
@JavaScript("frontend://vaadinBootstrapConnector.js")
public class VaadinBoostrapLayout extends Div {


    public VaadinBoostrapLayout() {
        initConnector(getElement());
    }

    private void initConnector(Element layout) {
        runBeforeClientResponse(ui -> ui.getPage().executeJs(
                "window.Vaadin.Flow.sortableConnector.initLazy($0)",
                getElement()));
    }

    private void runBeforeClientResponse(SerializableConsumer<UI> command) {
        getElement().getNode().runWhenAttached(ui -> ui
                .beforeClientResponse(this, context -> command.accept(ui)));
    }

}
