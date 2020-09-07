package org.vaadin.bootstrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsColor;

public interface HasBsOutlineColor<T> extends HasStyle {

    String getDefaultClassName();

    default String getOutlineClassName() {
        return getDefaultClassName() + "-outline";
    }
    default T withOutlineColor(BsColor color) {
        addClassName(getOutlineClassName() + "-" + color.buildClassName());
        return (T) this;
    }
}
