package org.vaadin.bootstrapcss;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.components.BsCard;
import org.vaadin.bootstrapcss.components.BsDiv;
import org.vaadin.bootstrapcss.components.BsH5;
import org.vaadin.bootstrapcss.components.BsParagraph;
import org.vaadin.bootstrapcss.mixins.HasBsBgColor;
import org.vaadin.bootstrapcss.mixins.HasBsBorderColor;
import org.vaadin.bootstrapcss.mixins.HasBsTextAlign;
import org.vaadin.bootstrapcss.mixins.HasBsTextColor;

/**
 * @author jcgueriaud
 */
@JsModule("./bs-card.js")
@Tag("bs-card")
public class BsLitCard extends Div implements HasBsTextColor<BsCard>, HasBsTextAlign<BsCard>, HasBsBgColor<BsCard>, HasBsBorderColor<BsCard> {

    private String defaultClassName = "card";

    private BsDiv cardHeader;
    private BsH5 cardTitle;
    private BsDiv cardBody;
    private BsParagraph cardText;
    private BsDiv cardFooter;

    public BsLitCard() {
    }

    public void setCardTitleText(String titleText) {

    }

    public void setCardHeaderText(String headerText) {
        getElement().setProperty("headerText", headerText);
    }

    public void setCardText(String text) {
        getElement().setProperty("contentText", text);

    }

    public void addButton(BsButton button) {

    }

    public void setCardFooterText(String footerText) {
        getElement().setProperty("footerText", footerText);
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
        if (cardFooter == null) {
            cardFooter = new BsDiv();
            add(cardFooter);
            cardFooter.getElement().setAttribute("slot", "footer");
        }
        return cardFooter;
    }
}
