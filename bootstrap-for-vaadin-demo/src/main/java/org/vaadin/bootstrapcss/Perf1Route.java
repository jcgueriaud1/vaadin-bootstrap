package org.vaadin.bootstrapcss;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.components.BsCard;

import java.util.ArrayList;
import java.util.List;

@Route(value ="perf1", layout = BootstrapLayout.class)
public class Perf1Route extends VerticalLayout {

    private List<BsCard> cards = new ArrayList<>();
    private int increment = 0;

    public Perf1Route() {
        BsButton bsButton = new BsButton("update the cards");
        bsButton.addClickListener(e -> {
            for (BsCard card : cards) {
                card.setCardHeaderText(card.getCardHeader().getText() + increment);
            }
        });
        add(bsButton);
        for (int i = 0; i < 2000; i++) {
            BsCard bsCard = buildBsCard("title" + i, "content" + i, "footer" + i);
            cards.add(bsCard);
            add(bsCard);
        }

    }

    private BsCard buildBsCard(String title, String content, String footer) {
        BsCard bsCard = new BsCard();
        bsCard.setCardHeaderText(title);
        bsCard.setCardText(content);
        //bsCard.setCardFooterText(footer);
        bsCard.getCardFooter().add(new BsButton(footer));
        return bsCard;
    }
}
