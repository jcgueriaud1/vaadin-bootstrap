package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;

public interface HasBsState<T> extends HasStyle {

    default T withDisabled() {
        addClassName("disabled");
        return (T) this;
    }

    default T withActive() {
        addClassName("active");
        return (T) this;
    }
}
