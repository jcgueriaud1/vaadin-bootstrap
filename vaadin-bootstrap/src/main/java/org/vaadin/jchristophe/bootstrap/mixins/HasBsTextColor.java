package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;

public interface HasBsTextColor<T> extends HasStyle {

    default T withTextPrimary() {
        addClassName("text-primary");
        return (T) this;
    }

    default T withTextSecondary() {
        addClassName("text-secondary");
        return (T) this;
    }
    default T withTextSuccess() {
        addClassName("text-success");
        return (T) this;
    }
    default T withTextDanger() {
        addClassName("text-danger");
        return (T) this;
    }
    default T withTextWarning() {
        addClassName("text-warning");
        return (T) this;
    }
    default T withTextInfo() {
        addClassName("text-info");
        return (T) this;
    }
    default T withTextLight() {
        addClassName("text-light");
        return (T) this;
    }
    default T withTextDark() {
        addClassName("text-dark");
        return (T) this;
    }
    default T withTextWhite() {
        addClassName("text-white");
        return (T) this;
    }
}
