package org.vaadin.boostrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsColor;

public interface HasBsColor<T> extends HasStyle {

    String getDefaultClassName();

    default T withColor(BsColor color) {
        addClassName(getDefaultClassName() + "-" + color.buildClassName());
        return (T) this;
    }
}
