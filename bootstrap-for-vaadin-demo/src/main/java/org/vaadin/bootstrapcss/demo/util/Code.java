package org.vaadin.bootstrapcss.demo.util;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.function.SerializableConsumer;

@StyleSheet("https://cdn.jsdelivr.net/gh/highlightjs/cdn-release@9.17.1/build/styles/tomorrow-night.min.css")
@JavaScript("https://cdn.jsdelivr.net/gh/highlightjs/cdn-release@9.17.1/build/highlight.min.js")
@Tag("code")
public class Code extends HtmlContainer {

    public Code() {
        runBeforeClientResponse(ui -> ui.getPage().executeJs(
                "hljs.highlightBlock($0)", getElement()));
    }

    private void runBeforeClientResponse(SerializableConsumer<UI> command) {
        getElement().getNode().runWhenAttached(ui -> ui
                .beforeClientResponse(this, context -> command.accept(ui)));
    }
}
