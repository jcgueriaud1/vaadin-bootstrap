package org.vaadin.boostrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.utils.BorderUtil;

public interface HasBsBorderColor<T extends HasBsBorderColor<T>> extends HasStyle {

    default T withBorderColor(BsColor color) {
        return BorderUtil.withBorderColor((T) this, color);
    }
    default T withBorder() {
        return BorderUtil.withBorder((T) this);
    }
}
