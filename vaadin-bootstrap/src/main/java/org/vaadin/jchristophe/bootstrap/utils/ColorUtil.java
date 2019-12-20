package org.vaadin.jchristophe.bootstrap.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;

public class ColorUtil {

     public static <T extends HasStyle> T withBgColor(T container, BsColor color) {
        container.addClassName(color.buildBgClassName());
        return container;
    }
}
