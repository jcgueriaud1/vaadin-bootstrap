package org.vaadin.bootstrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsColor;
import org.vaadin.bootstrapcss.utils.ColorUtil;

public interface HasBsBgColor<T extends HasBsBgColor<T>> extends HasStyle {

    default T withBgColor(BsColor color) {
        return ColorUtil.withBgColor((T) this, color);
    }
}
