package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.components.BsCard;
import org.vaadin.boostrapcss.demo.BsDemoView;

@Route(value = CardExample.CURRENT_URL)
public class CardExample extends BsDemoView {

    public static final String CURRENT_URL = "components/card/";

    public CardExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createCenterExample();
        createPrimaryExample();
    }

    private void createPrimaryExample() {
        Div message = createMessageDiv("primary-message");
        message.setText("Different colors configuration for card");
        // begin-source-example
        // source-example-heading: Color Example
        BsCard card = new BsCard();
        card.setCardHeaderText("Featured");
        card.getCardHeader().withBgPrimary();
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        card.getCardBody().withTextPrimary();
        BsButton button = new BsButton("Go somewhere").withOutlineSecondary();
        card.addButton(button);
        card.setCardFooterText("2 days ago");
        card.getCardFooter().withBgInfo();
        // end-source-example

        addCodeExample("Color Example", card, message);
    }

    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for card");
        // begin-source-example
        // source-example-heading: Basic Example
        BsCard card = new BsCard();
        card.setCardHeaderText("Featured");
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        BsButton button = new BsButton("Go somewhere").withPrimary();
        card.addButton(button);
        card.setCardFooterText("2 days ago");
        // end-source-example

        addCodeExample("Basic Example", card, message);
    }

    private void createCenterExample() {
        Div message = createMessageDiv("center-message");
        message.setText("Danger and center for card");
        // begin-source-example
        // source-example-heading: Center Example
        BsCard card = new BsCard().withTextCenter().withBorderDanger().withTextDanger();
        card.setCardHeaderText("Featured");
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        BsButton button = new BsButton("Go somewhere").withDanger();
        card.addButton(button);
        card.setCardFooterText("2 days ago");
        // end-source-example

        addCodeExample("Center Example", card, message);
    }

}
