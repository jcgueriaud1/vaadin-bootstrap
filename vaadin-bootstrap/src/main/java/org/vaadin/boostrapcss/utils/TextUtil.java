package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;

public class TextUtil {

    public static <T extends HasStyle> T withFontWeightBold(T container) {
        container.addClassName("font-weight-bold");
        return container;
    }

    public static <T extends HasStyle> T withFontWeightBolder(T container) {
        container.addClassName("font-weight-bolder");
        return container;
    }

    public static <T extends HasStyle> T withFontWeightNormal(T container) {
        container.addClassName("font-weight-normal");
        return container;
    }

    public static <T extends HasStyle> T withFontWeightLight(T container) {
        container.addClassName("font-weight-light");
        return container;
    }

    public static <T extends HasStyle> T withFontWeightLighter(T container) {
        container.addClassName("font-weight-lighter");
        return container;
    }

    public static <T extends HasStyle> T withFontItalic(T container) {
        container.addClassName("font-italic");
        return container;
    }

}
