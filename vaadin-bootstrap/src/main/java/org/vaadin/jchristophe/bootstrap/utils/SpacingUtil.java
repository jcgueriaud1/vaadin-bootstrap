package org.vaadin.jchristophe.bootstrap.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;
import org.vaadin.jchristophe.bootstrap.enums.BsPosition;

public class SpacingUtil {

     public static <T extends HasStyle> T withMargin(T container, BsPosition position, int value) {
        container.addClassName("m"+position.buildClassName(value));
        return container;
    }
    public static <T extends HasStyle> T withPadding(T container, BsPosition position, int value) {
        container.addClassName("p"+position.buildClassName(value));
        return container;
    }
}
