package org.vaadin.boostrapcss.demo.util;

import com.github.appreciated.demo.helper.component.GraniteClipboard;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.mixins.HasBsColor;
import org.vaadin.boostrapcss.mixins.HasBsOutlineColor;
import org.vaadin.boostrapcss.mixins.HasBsSizeTheme;

public class GraniteButton extends GraniteClipboard implements HasBsColor<BsButton>, HasBsSizeTheme<BsButton>, HasBsOutlineColor<BsButton>, HasText, ClickNotifier<GraniteButton> {

    private String defaultClassName = "btn";

    public GraniteButton() {
        addClassName(defaultClassName);
        addClickListener(clickEvent -> {
            HorizontalLayout hl = new HorizontalLayout(VaadinIcon.INFO.create(), new Label("Code has been copied to clipboard"));
            Notification notification = new Notification(hl);
            notification.setDuration(3000);
            notification.setPosition(Notification.Position.BOTTOM_END);
            notification.getElement().getStyle().set("background", "red");
            notification.setOpened(true);
        });
    }

    public GraniteButton(String text) {
        this();
        setText(text);
    }

    @Override
    public String getDefaultClassName() {
        return defaultClassName;
    }

}