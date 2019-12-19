package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.demo.Card;
import com.vaadin.flow.demo.DemoNavigationBar;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.demo.SourceCodeExample;
import com.vaadin.flow.demo.SourceContent;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.jchristophe.bootstrap.components.BsNavBar;
import org.vaadin.jchristophe.util.SourceContentResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

//
//@StyleSheet("https://use.fontawesome.com/releases/v5.8.2/css/all.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/css/mdb.min.css")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/js/mdb.min.js")

@Tag("div")
@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css")
@JavaScript("https://code.jquery.com/jquery-3.4.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js")
public abstract class BsDemoView extends Component
        implements HasComponents, HasStyle {

    private BsNavBar navBar;
    private final Div container = new Div();

    private final Map<String, List<SourceCodeExample>> sourceCodeExamples = new HashMap<>();

    /**
     * When called the view should populate the given SourceContainer with
     * sample source code to be shown.
     */
    public void populateSources() {
        SourceContentResolver.getSourceCodeExamplesForClass(getClass())
                .forEach(this::putSourceCode);
    }

    private void putSourceCode(SourceCodeExample example) {
        String heading = example.getHeading();
        List<SourceCodeExample> list = sourceCodeExamples
                .computeIfAbsent(heading, key -> new ArrayList<>());
        list.add(example);
    }

    protected Card addCard(String heading,
                         Component... components) {
        Card card = new Card();
        if (components != null && components.length > 0) {
            card.add(components);
        }

        List<SourceCodeExample> list = sourceCodeExamples.get(heading);
        if (list != null) {
            list.stream().map(this::createSourceContent).forEach(card::add);
        }

        container.add(card);
        return card;
    }

    private SourceContent createSourceContent(
            SourceCodeExample sourceCodeExample) {
        SourceContent content = new SourceContent();
        String sourceString = sourceCodeExample.getSourceCode();
        switch (sourceCodeExample.getSourceType()) {
            case CSS:
                content.addCss(sourceString);
                break;
            case JAVA:
                content.addCode(sourceString);
                break;
            case HTML:
                content.addHtml(sourceString);
                break;
            case UNDEFINED:
            default:
                content.addCode(sourceString);
                break;
        }
        return content;
    }

    public BsDemoView() {
        createNavBar();
        add(container);

        populateSources();
        initView();
    }

    protected void initView() {

    }


    private void createNavBar() {
        navBar = new BsNavBar("mainNav").withNavBarDark().withBgDark();
        navBar.addNavLink(new RouterLink("Badge", BadgeExample.class));
        navBar.addNavLink(new RouterLink("Buttons", ButtonExample.class));
        navBar.addNavLink(new RouterLink("Card", CardExample.class));
        navBar.addNavLink(new RouterLink("Collapse", CollapseExample.class));
        navBar.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        navBar.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        navBar.addNavLink(new RouterLink("Grid", GridExample.class));
        navBar.withNavBrandText("BootstrapDocs");
        add(navBar);
    }

    protected Div createMessageDiv(String id) {
        Div message = new Div();
        message.setId(id);
        message.getStyle().set("whiteSpace", "pre");
        return message;
    }

}
