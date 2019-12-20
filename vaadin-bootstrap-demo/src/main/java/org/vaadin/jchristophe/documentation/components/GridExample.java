package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsCard;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;
import org.vaadin.jchristophe.bootstrap.enums.BsVerticalAlign;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsContainer;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsRow;

@Route(value ="grid")
public class GridExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createMixAndMatch();
        createCardLayout();
    }

    public void createMixAndMatch() {
        Div message = createMessageDiv("mix-match-message");
        message.setText("Mix and match - responsive grid");

        // begin-source-example
        // source-example-heading: Mix and match Example
        BsContainer container = new BsContainer().withBgLight();
        BsRow row1 = container.addRow();
        row1.addCol().withSizes(12,8, 4).withBgColor(BsColor.LIGHT).add(new Text("col-12 col-xs-8 col-md-4"));
        row1.addCol().withSizes(12,4, 2).withBgColor(BsColor.INFO).add(new Text("col-12 col-xs-4 col-md-2"));
        row1.addCol().withSizes(12,12, 6).withBgColor(BsColor.WARNING).add(new Text("col-12 col-xs-12 col-md-4"));
        BsRow row2 = container.addRow();
        row2.addCol().withSizes(6).withBgColor(BsColor.LIGHT).add(new Text("col-6"));
        row2.addCol().withSizes(6, 3).withBgColor(BsColor.INFO).add(new Text("col-6 col-xs-3"));
        row2.addCol().withSizes(12,3).withBgColor(BsColor.WARNING).add(new Text("col-12 col-xs-3"));
        // end-source-example

        addCard("Mix and match Example", container, message);

    }

    public void createCardLayout() {
        Div message = createMessageDiv("card-message");
        message.setText("Card layout - responsive grid");

        // begin-source-example
        // source-example-heading: Card layout Example
        BsContainer container = new BsContainer(true);
        BsRow row = container.addRow().withVerticalAlign(BsVerticalAlign.CENTER);
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 1"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 2"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 3"));
        row.addCol().withSizes(12,12, 12, 8, 6).add(buildCardDemo("Double size card 4"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 5"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 6"));

        // end-source-example

        addCard("Card layout Example", container, message);

    }


    private BsCard buildCardDemo(String title) {
        BsCard card = new BsCard();
        card.setCardHeaderText(title);
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        return card;
    }

}
