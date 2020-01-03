package org.vaadin.boostrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.utils.ColorUtil;

public interface HasBsBgColor<T extends HasBsBgColor<T>> extends HasStyle {

    default T withBgColor(BsColor color) {
        return ColorUtil.withBgColor((T) this, color);
    }
}
