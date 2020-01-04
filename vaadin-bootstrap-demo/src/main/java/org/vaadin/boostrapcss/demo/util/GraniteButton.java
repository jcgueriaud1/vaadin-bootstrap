package org.vaadin.boostrapcss.demo.util;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.mixins.HasBsColor;
import org.vaadin.boostrapcss.mixins.HasBsOutlineColor;
import org.vaadin.boostrapcss.mixins.HasBsSizeTheme;

@NpmPackage(value = "@granite-elements/granite-clipboard", version = "3.0.0")
@JsModule("@granite-elements/granite-clipboard/granite-clipboard.js")
@Tag("granite-clipboard")
public class GraniteButton extends Component implements HasComponents, HasBsColor<BsButton>, HasBsSizeTheme<BsButton>, HasBsOutlineColor<BsButton>, HasText, ClickNotifier<GraniteButton> {

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

    public void setClipboard(String value) {
        getElement().setAttribute("text", value);
    }

}