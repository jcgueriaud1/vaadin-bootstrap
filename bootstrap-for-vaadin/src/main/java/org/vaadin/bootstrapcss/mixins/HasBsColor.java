package org.vaadin.bootstrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsColor;

public interface HasBsColor<T> extends HasStyle {

    String getDefaultClassName();

    default T withColor(BsColor color) {
        addClassName(getDefaultClassName() + "-" + color.buildClassName());
        return (T) this;
    }
}
