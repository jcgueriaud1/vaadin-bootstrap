package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsColor;

public class ColorUtil {

     public static <T extends HasStyle> T withBgColor(T container, BsColor color) {
        container.addClassName(color.buildBgClassName());
        return container;
    }
    public static <T extends HasStyle> T withTextColor(T container, BsColor color) {
        container.addClassName(color.buildTextClassName());
        return container;
    }
    public static <T extends HasStyle> T withBorderColor(T container, BsColor color) {
        container.addClassName(color.buildBorderClassName());
        return container;
    }
}
