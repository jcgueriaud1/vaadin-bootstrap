package org.vaadin.bootstrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsColor;
import org.vaadin.bootstrapcss.utils.BorderUtil;

public interface HasBsBorderColor<T extends HasBsBorderColor<T>> extends HasStyle {

    default T withBorderColor(BsColor color) {
        return BorderUtil.withBorderColor((T) this, color);
    }
    default T withBorder() {
        return BorderUtil.withBorder((T) this);
    }
}
