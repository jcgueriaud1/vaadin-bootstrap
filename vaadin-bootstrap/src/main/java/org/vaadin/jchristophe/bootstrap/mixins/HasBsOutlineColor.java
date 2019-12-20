package org.vaadin.jchristophe.bootstrap.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.jchristophe.bootstrap.enums.BsColor;

public interface HasBsOutlineColor<T> extends HasStyle {

    String getDefaultClassName();

    default String getOutlineClassName() {
        return getDefaultClassName() + "-outline";
    }

    default T withOutlinePrimary() {
        addClassName(getOutlineClassName() + "-primary");
        return (T) this;
    }

    default T withOutlineSecondary() {
        addClassName(getOutlineClassName() + "-secondary");
        return (T) this;
    }
    default T withOutlineSuccess() {
        addClassName(getOutlineClassName() + "-success");
        return (T) this;
    }
    default T withOutlineDanger() {
        addClassName(getOutlineClassName() + "-danger");
        return (T) this;
    }
    default T withOutlineWarning() {
        addClassName(getOutlineClassName() + "-warning");
        return (T) this;
    }
    default T withOutlineInfo() {
        addClassName(getOutlineClassName() + "-info");
        return (T) this;
    }
    default T withOutlineLight() {
        addClassName(getOutlineClassName() + "-light");
        return (T) this;
    }
    default T withOutlineDark() {
        addClassName(getOutlineClassName() + "-dark");
        return (T) this;
    }
    default T withOutlineColor(BsColor color) {
        addClassName(getOutlineClassName() + "-" + color.buildClassName());
        return (T) this;
    }
}
