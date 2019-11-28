package org.vaadin.jchristophe.bootstrap.utils;

import com.vaadin.flow.component.HasStyle;

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
}
