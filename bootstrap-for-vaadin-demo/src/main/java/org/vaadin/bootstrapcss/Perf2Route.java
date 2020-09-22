package org.vaadin.bootstrapcss;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.components.BsButton;

import java.util.ArrayList;
import java.util.List;

@Route(value ="perf2", layout = BootstrapLayout.class)
public class Perf2Route extends VerticalLayout {

    private List<BsLitCard> cards = new ArrayList<>();
    private int increment = 0;

    public Perf2Route() {
        BsButton bsButton = new BsButton("update the cards");
        bsButton.addClickListener(e -> {
            increment++;
            for (BsLitCard card : cards) {
                card.setCardHeaderText("test" + increment);
            }
        });
        add(bsButton);
        for (int i = 0; i < 2000; i++) {
            BsLitCard bsCard = buildBsCard("title" + i, "content" + i, "footer" + i);
            cards.add(bsCard);
            add(bsCard);
        }

    }

    private BsLitCard buildBsCard(String title, String content, String footer) {
        BsLitCard bsCard = new BsLitCard();
        bsCard.setCardHeaderText(title);
        bsCard.setCardText(content);
        //bsCard.setCardFooterText(footer);
        bsCard.getCardFooter().add(new BsButton(footer));
        return bsCard;
    }
}
