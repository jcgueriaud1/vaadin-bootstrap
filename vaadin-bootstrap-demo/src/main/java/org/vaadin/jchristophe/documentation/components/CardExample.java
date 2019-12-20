package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.components.BsCard;

@Route(value ="card")
public class CardExample extends BsDemoView {

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

        addCard("Color Example", card, message);
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

        addCard("Basic Example", card, message);
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

        addCard("Center Example", card, message);
    }

}
