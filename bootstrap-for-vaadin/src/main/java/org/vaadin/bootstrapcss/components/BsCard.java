package org.vaadin.bootstrapcss.components;

import com.vaadin.flow.component.html.Div;
import org.vaadin.bootstrapcss.mixins.HasBsBgColor;
import org.vaadin.bootstrapcss.mixins.HasBsBorderColor;
import org.vaadin.bootstrapcss.mixins.HasBsTextAlign;
import org.vaadin.bootstrapcss.mixins.HasBsTextColor;

public class BsCard extends Div implements HasBsTextColor<BsCard>, HasBsTextAlign<BsCard>, HasBsBgColor<BsCard>, HasBsBorderColor<BsCard> {

    private String defaultClassName = "card";

    private BsDiv cardHeader;
    private BsH5 cardTitle;
    private BsDiv cardBody;
    private BsParagraph cardText;
    private BsDiv cardFooter;

    public BsCard() {
        addClassName(defaultClassName);
        add(cardHeader = new BsDiv());
        cardHeader.addClassName("card-header");
        cardHeader.setVisible(false);
        add(cardBody = new BsDiv());
        cardBody.addClassName("card-body");

        cardBody.add(cardTitle = new BsH5());
        cardTitle.addClassName("card-title");
        cardTitle.setVisible(false);
        cardBody.add(cardText = new BsParagraph());
        cardText.addClassName("card-text");
        cardText.setVisible(false);
        add(cardFooter = new BsDiv());
        cardFooter.addClassName("card-footer");
        cardFooter.setVisible(false);
    }

    public void setCardTitleText(String titleText) {
        cardBody.setVisible(true);
        cardTitle.setVisible(true);
        cardTitle.setText(titleText);
    }

    public void setCardHeaderText(String headerText) {
        cardHeader.setVisible(true);
        cardHeader.setText(headerText);
    }

    public void setCardText(String text) {
        cardText.setVisible(true);
        cardText.setText(text);
    }

    public void addButton(BsButton button) {
        cardBody.setVisible(true);
        cardBody.add(button);
    }

    public void setCardFooterText(String footerText) {
        cardFooter.setVisible(true);
        cardFooter.setText(footerText);
    }

    public BsDiv getCardHeader() {
        return cardHeader;
    }

    public BsH5 getCardTitle() {
        return cardTitle;
    }

    public BsDiv getCardBody() {
        return cardBody;
    }

    public BsDiv getCardFooter() {
        return cardFooter;
    }
}
