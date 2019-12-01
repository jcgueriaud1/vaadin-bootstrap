package org.vaadin.jchristophe.bootstrap.utils;

import com.vaadin.flow.component.HasStyle;

public interface HasBsBorderColor<T> extends HasStyle {

    default T withBorderPrimary() {
        addClassName("border-primary");
        return (T) this;
    }

    default T withBorderSecondary() {
        addClassName("border-secondary");
        return (T) this;
    }
    default T withBorderSuccess() {
        addClassName("border-success");
        return (T) this;
    }
    default T withBorderDanger() {
        addClassName("border-danger");
        return (T) this;
    }
    default T withBorderWarning() {
        addClassName("border-warning");
        return (T) this;
    }
    default T withBorderInfo() {
        addClassName("border-info");
        return (T) this;
    }
    default T withBorderLight() {
        addClassName("border-light");
        return (T) this;
    }
    default T withBorderDark() {
        addClassName("border-dark");
        return (T) this;
    }
}
