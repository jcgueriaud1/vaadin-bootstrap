package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsSize;

public class SizeUtil {

    public static <T extends HasStyle> T withWidth(T container, BsSize size) {
        container.addClassName("w-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withHeight(T container, BsSize size) {
        container.addClassName("h-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withMaxWidth(T container, BsSize size) {
        container.addClassName("mw-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withMaxHeight(T container, BsSize size) {
        container.addClassName("mh-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withViewWidth(T container, BsSize size) {
        container.addClassName("vw-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withViewHeight(T container, BsSize size) {
        container.addClassName("vh-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withMinViewWidth(T container, BsSize size) {
        container.addClassName("min-vw-"+size.buildClassName());
        return container;
    }

    public static <T extends HasStyle> T withMinViewHeight(T container, BsSize size) {
        container.addClassName("min-vh-"+size.buildClassName());
        return container;
    }
}
