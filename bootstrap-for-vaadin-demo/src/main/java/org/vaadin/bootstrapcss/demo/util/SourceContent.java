package org.vaadin.bootstrapcss.demo.util;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

public class SourceContent extends Div {

    /**
     * Default constructor for the component.
     */
    public SourceContent() {
        getElement().getClassList().add("sources");
    }

    /**
     * Adds a text to be rendered as a Java source code inside the component.
     *
     * @param text
     *            The source code to be shown.
     */
    public void addCode(String text) {
        addSourceCodeBlock(text, "language-java");
    }

    /**
     * Adds a text to be rendered as a CSS source code inside the component.
     *
     * @param text
     *            The source code to be shown.
     */
    public void addCss(String text) {
        addSourceCodeBlock(text, "language-css");
    }

    /**
     * Adds a text to be rendered as a HTML source code inside the component.
     *
     * @param text
     *            The source code to be shown.
     */
    public void addHtml(String text) {
        addSourceCodeBlock(text, "language-markup");
    }

    /**
     * Adds an {@link Element} directly into this component, without need to use
     * a component for it.
     *
     * @param element
     *            The element to be added to this component.
     */
    public void add(Element element) {
        getElement().appendChild(element);
    }

    private void addSourceCodeBlock(String text, String className) {
        Element pre = new Element("pre");
        Element code = new Element("code");
        pre.appendChild(code);
        code.setAttribute("spellcheck", "false");
        code.getClassList().add(className);
        code.setText(text);
        getElement().appendChild(pre);
    }
}
