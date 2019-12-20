package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;
import org.vaadin.jchristophe.bootstrap.utils.ColorUtil;

public interface HasBsBgColor<T extends HasBsBgColor<T>> extends HasStyle {

    default T withBgPrimary() {
        addClassName("bg-primary");
        return (T) this;
    }

    default T withBgSecondary() {
        addClassName("bg-secondary");
        return (T) this;
    }
    default T withBgSuccess() {
        addClassName("bg-success");
        return (T) this;
    }
    default T withBgDanger() {
        addClassName("bg-danger");
        return (T) this;
    }
    default T withBgWarning() {
        addClassName("bg-warning");
        return (T) this;
    }
    default T withBgInfo() {
        addClassName("bg-info");
        return (T) this;
    }
    default T withBgLight() {
        addClassName("bg-light");
        return (T) this;
    }
    default T withBgDark() {
        addClassName("bg-dark");
        return (T) this;
    }
    default T withBgColor(BsColor color) {
        return ColorUtil.withBgColor((T) this, color);
    }
}
