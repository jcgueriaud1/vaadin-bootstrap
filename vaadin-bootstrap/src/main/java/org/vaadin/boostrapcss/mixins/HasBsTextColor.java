package org.vaadin.boostrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.utils.ColorUtil;

public interface HasBsTextColor<T extends HasBsTextColor<T>> extends HasStyle {

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

    default T withTextColor(BsColor color) {
        return ColorUtil.withTextColor((T) this, color);
    }
}
