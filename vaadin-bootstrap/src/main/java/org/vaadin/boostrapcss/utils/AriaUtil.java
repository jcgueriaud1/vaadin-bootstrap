package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;

public class AriaUtil {

     public static <T extends HasStyle> T withAriaLabel(T container, String value) {
        container.getElement().setAttribute("aria-label", value);
        return container;
    }
}