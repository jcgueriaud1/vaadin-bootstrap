package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;

public class DisplayUtil {

    public static <T extends HasStyle> T withDisplayBlock(T container, BsResponsiveBP responsiveBP) {
        container.addClassName(responsiveBP.buildClassName("d")+"-block");
        return container;
    }

    public static <T extends HasStyle> T withDisplayNone(T container, BsResponsiveBP responsiveBP) {
        container.addClassName(responsiveBP.buildClassName("d")+"-none");
        return container;
    }

    public static <T extends HasStyle> T withDisplayNone(T container) {
        return withDisplayNone(container, BsResponsiveBP.ALL);
    }
}
