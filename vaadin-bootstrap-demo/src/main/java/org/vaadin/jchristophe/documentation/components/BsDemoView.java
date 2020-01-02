package org.vaadin.jchristophe.documentation.components;

import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.prism.element.Language;
import com.github.appreciated.prism.element.PrismHighlighter;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.components.BsCard;
import org.vaadin.jchristophe.bootstrap.components.BsNavBar;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;
import org.vaadin.jchristophe.bootstrap.enums.BsPosition;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsCol;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsContainer;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsRow;
import org.vaadin.jchristophe.bootstrap.utils.SpacingUtil;
import org.vaadin.jchristophe.util.GraniteButton;
import org.vaadin.jchristophe.util.SourceCodeExample;
import org.vaadin.jchristophe.util.SourceContentResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//@StyleSheet("https://use.fontawesome.com/releases/v5.8.2/css/all.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css")
//@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/css/mdb.min.css")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/js/mdb.min.js")

//@StyleSheet("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/css/coreui.min.css")
//@JavaScript("https://code.jquery.com/jquery-3.4.1.slim.min.js")
//@JavaScript("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/js/coreui.min.js")
//@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js")

@Tag("div")

@CssImport("./demo.css")
@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css")
@JavaScript("https://code.jquery.com/jquery-3.4.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js")
public abstract class BsDemoView extends DemoHelperView /*extends Component*/
        implements HasComponents, HasStyle {

    private BsNavBar mainNavigation;
    private final BsContainer container = new BsContainer(true);

    private final List<Component> codes = new ArrayList<>();

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

    protected BsCard addCard(String heading,
                             Component component, Component message) {
        BsCard card = new BsCard();
        SpacingUtil.withMargin(card,BsPosition.BOTTOM,2);
        BsRow headerRow = new BsRow();
        headerRow.addCol().withEqualSize().add(new Span(heading));
        card.getCardHeader().add(headerRow);
        card.getCardHeader().setVisible(true);
        BsRow bsRow = new BsRow();

        card.add(bsRow);
        bsRow.addCol().withEqualSize().add(component);

        List<SourceCodeExample> list = sourceCodeExamples.get(heading);
        if (list != null) {
            list.stream().map(this::createSourceContent).forEach(codeExample -> {
                PrismHighlighter prismHighlighter = new PrismHighlighter(codeExample.getCode(), codeExample.getHighlightingType());
                BsCol bsCol = bsRow.addCol().withSizes(12, 6).withBgColor(BsColor.LIGHT);
                bsCol.add(prismHighlighter);
                codes.add(bsCol);

                GraniteButton graniteButton = new GraniteButton("Copy code");
                graniteButton.withColor(BsColor.PRIMARY);
                graniteButton.setClipboard(codeExample.getCode());
                graniteButton.withSm();

                BsButton hideCodeButton = new BsButton("Show/Hide code").withColor(BsColor.PRIMARY);
                hideCodeButton.withSm();
                hideCodeButton.addClickListener(event -> {
                    boolean highlighterVisible = bsCol.isVisible();
                    codes.forEach(code ->
                                code.setVisible(!highlighterVisible)
                    );
                });
                SpacingUtil.withMargin(hideCodeButton, BsPosition.RIGHT,2);
                headerRow.addCol().withAutoSize().add(new Div(hideCodeButton , graniteButton));
            });
        }
        container.add(card);
        return card;
    }

    private CodeExample createSourceContent(
            SourceCodeExample sourceCodeExample) {
        CodeExample content;
        String sourceString = sourceCodeExample.getSourceCode();
        switch (sourceCodeExample.getSourceType()) {
            case CSS:
                content = new CodeExample(sourceString, Language.css, "css");
                break;
            default:
                content = new CodeExample(sourceString, Language.java, "Java");
                break;
        }
        return content;
    }

    public BsDemoView() {
        createNavBar();
        add(container);

        populateSources();
        initView();
        getElement().getStyle().clear();
    }

    protected void initView() {

    }


    private void createNavBar() {
        mainNavigation = new BsNavBar("mainNav").withNavBarDark().withBgDark().withStickyTop();
        mainNavigation.addNavLink(new RouterLink("Badge", BadgeExample.class));
        mainNavigation.addNavLink(new RouterLink("Buttons", ButtonExample.class));
        mainNavigation.addNavLink(new RouterLink("Card", CardExample.class));
        mainNavigation.addNavLink(new RouterLink("Collapse", CollapseExample.class));
        mainNavigation.addNavLink(new RouterLink("NavBar", NavBarExample.class));
        mainNavigation.addNavLink(new RouterLink("ListGroup", ListGroupExample.class));
        mainNavigation.addNavLink(new RouterLink("Form", FormExample.class));
        mainNavigation.addNavLink(new RouterLink("Grid", GridExample.class));
        mainNavigation.withNavBrandText("BootstrapDocs");
        add(mainNavigation);
    }

    protected Div createMessageDiv(String id) {
        Div message = new Div();
        message.setId(id);
        message.getStyle().set("whiteSpace", "pre");
        return message;
    }

}
