package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsSize;

public interface HasBsSizeTheme<T> extends HasStyle {

    String getDefaultClassName();

    default T withSm() {
        addClassName(getDefaultClassName() + "-sm");
        return (T) this;
    }

    default T withLg() {
        addClassName(getDefaultClassName() + "-lg");
        return (T) this;
    }

    default T withSize(BsSize size) {
        addClassName(getDefaultClassName() + "-" + size.buildClassName());
        return (T) this;
    }
}
