package org.vaadin.bootstrapcss.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsColor;
import org.vaadin.bootstrapcss.enums.BsPosition;

public class BorderUtil {

    private static final String BORDER_CSS_NAME = "border";
    private static final String ROUNDED_CSS_NAME = "rounded";

    public static <T extends HasStyle> T withBorder(T container) {
        container.addClassName(BORDER_CSS_NAME);
        return container;
    }

    public static <T extends HasStyle> T withBorder(T container, BsPosition position) {
         switch (position) {
             case ALL:
                 container.addClassName(BORDER_CSS_NAME);
                 break;
             case BOTTOM:
                 container.addClassName(BORDER_CSS_NAME + "-bottom");
                 break;
             case RIGHT:
                 container.addClassName(BORDER_CSS_NAME + "-right");
                 break;
              case TOP:
                  container.addClassName(BORDER_CSS_NAME + "-top");
                  break;
             case LEFT:
                 container.addClassName(BORDER_CSS_NAME + "-left");
                 break;
             case VERTICAL:
                 container.addClassNames(BORDER_CSS_NAME + "-top",BORDER_CSS_NAME + "-bottom");
                 break;
             case HORIZONTAL:
                 container.addClassNames(BORDER_CSS_NAME + "-left",BORDER_CSS_NAME + "-right");
                 break;
         }
         return container;
    }

    public static <T extends HasStyle> T withoutBorder(T container, BsPosition position) {
        switch (position) {
            case ALL:
                container.addClassName(BORDER_CSS_NAME+ "-0");
                break;
            case BOTTOM:
                container.addClassName(BORDER_CSS_NAME + "-bottom-0");
                break;
            case RIGHT:
                container.addClassName(BORDER_CSS_NAME + "-right-0");
                break;
            case TOP:
                container.addClassName(BORDER_CSS_NAME + "-top-0");
                break;
            case LEFT:
                container.addClassName(BORDER_CSS_NAME + "-left-0");
                break;
            case VERTICAL:
                container.addClassNames(BORDER_CSS_NAME + "-top-0",BORDER_CSS_NAME + "-bottom-0");
                break;
            case HORIZONTAL:
                container.addClassNames(BORDER_CSS_NAME + "-left-0",BORDER_CSS_NAME + "-right-0");
                break;
        }
        return container;
    }

    public static <T extends HasStyle> T withBorderColor(T container, BsColor color) {
         return ColorUtil.withBorderColor(container, color);
    }


    public static <T extends HasStyle> T withRounded(T container, BsPosition position) {
        switch (position) {
            case ALL:
                container.addClassName(ROUNDED_CSS_NAME);
                break;
            case BOTTOM:
                container.addClassName(ROUNDED_CSS_NAME + "-bottom");
                break;
            case RIGHT:
                container.addClassName(ROUNDED_CSS_NAME + "-right");
                break;
            case TOP:
                container.addClassName(ROUNDED_CSS_NAME + "-top");
                break;
            case LEFT:
                container.addClassName(ROUNDED_CSS_NAME + "-left");
                break;
            case VERTICAL:
                container.addClassNames(ROUNDED_CSS_NAME + "-top",BORDER_CSS_NAME + "-bottom");
                break;
            case HORIZONTAL:
                container.addClassNames(ROUNDED_CSS_NAME + "-left",BORDER_CSS_NAME + "-right");
                break;
        }
        return container;
    }

    public static <T extends HasStyle> T withoutRounded(T container) {
        container.addClassName(ROUNDED_CSS_NAME + "-0");
        return container;
    }

    public static <T extends HasStyle> T withRoundedPill(T container) {
        container.addClassName(ROUNDED_CSS_NAME + "-pill");
        return container;
    }
    public static <T extends HasStyle> T withRoundedCircle(T container) {
        container.addClassName(ROUNDED_CSS_NAME + "-circle");
        return container;
    }
    public static <T extends HasStyle> T withRoundedSm(T container) {
        container.addClassName(ROUNDED_CSS_NAME + "-sm");
        return container;
    }
    public static <T extends HasStyle> T withRoundedLg(T container) {
        container.addClassName(ROUNDED_CSS_NAME + "-lg");
        return container;
    }
}
