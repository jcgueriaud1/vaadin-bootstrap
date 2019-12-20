package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;

public interface HasBsColor<T> extends HasStyle {

    String getDefaultClassName();

    default T withPrimary() {
        addClassName(getDefaultClassName() + "-primary");
        return (T) this;
    }

    default T withSecondary() {
        addClassName(getDefaultClassName() + "-secondary");
        return (T) this;
    }
    default T withSuccess() {
        addClassName(getDefaultClassName() + "-success");
        return (T) this;
    }
    default T withDanger() {
        addClassName(getDefaultClassName() + "-danger");
        return (T) this;
    }
    default T withWarning() {
        addClassName(getDefaultClassName() + "-warning");
        return (T) this;
    }
    default T withInfo() {
        addClassName(getDefaultClassName() + "-info");
        return (T) this;
    }
    default T withLight() {
        addClassName(getDefaultClassName() + "-light");
        return (T) this;
    }
    default T withDark() {
        addClassName(getDefaultClassName() + "-dark");
        return (T) this;
    }
    default T withColor(BsColor color) {
        addClassName(getDefaultClassName() + "-" + color.buildClassName());
        return (T) this;
    }
}
