package org.vaadin.boostrapcss.utils;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsPosition;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;

public class SpacingUtil {

    /**
     * Add margin to the container
     *
     * @param container container to
     * @param position is on of:
     *                 <ul>
     *                 <li>t - for classes that set margin-top or padding-top</li>
     *                 <li>b - for classes that set margin-bottom or padding-bottom</li>
     *                 <li>l - for classes that set margin-left or padding-left</li>
     *                 <li>r - for classes that set margin-right or padding-right</li>
     *                 <li>x - for classes that set both *-left and *-right</li>
     *                 <li>y - for classes that set both *-top and *-bottom</li>
     *                 <li>blank - for classes that set a margin or padding on all 4 sides of the element</li>
     *                 </ul>
     * @param size is one of:
     *      <ul>
     *      <li>0 - for classes that eliminate the margin or padding by setting it to 0</li>
     *      <li>1 - (by default) for classes that set the margin or padding to $spacer * .25</li>
     *      <li>2 - (by default) for classes that set the margin or padding to $spacer * .5</li>
     *      <li>3 - (by default) for classes that set the margin or padding to $spacer</li>
     *      <li>4 - (by default) for classes that set the margin or padding to $spacer * 1.5</li>
     *      <li>5 - (by default) for classes that set the margin or padding to $spacer * 3</li>
     *      <li>auto - for classes that set the margin to auto</li>
     *      </ul>
     *
     * @param <T> Type of the container
     * @return container
     */
     public static <T extends HasStyle> T withMargin(T container, BsPosition position, int size) {
        container.addClassName("m"+position.buildClassName(size));
        return container;
    }

    public static <T extends HasStyle> T withPadding(T container, BsPosition position, int size) {
        container.addClassName("p"+position.buildClassName(size));
        return container;
    }

    public static <T extends HasStyle> T withMargin(T container, BsResponsiveBP responsiveBP, BsPosition position, int size) {
        container.addClassName("m"+position.buildClassName(responsiveBP, size));
        return container;
    }

    public static <T extends HasStyle> T withPadding(T container, BsResponsiveBP responsiveBP, BsPosition position, int size) {
        container.addClassName("p"+position.buildClassName(responsiveBP, size));
        return container;
    }
}
