package org.vaadin.jchristophe.bootstrap.utils;

import com.vaadin.flow.component.HasStyle;

public interface HasBsTextAlign<T> extends HasStyle {

    default T withTextLeft() {
        addClassName("text-left");
        return (T) this;
    }

    default T withTextCenter() {
        addClassName("text-center");
        return (T) this;
    }
    default T withTextRight() {
        addClassName("text-right");
        return (T) this;
    }
    default T withTextJustify() {
        addClassName("text-justify");
        return (T) this;
    }

}
