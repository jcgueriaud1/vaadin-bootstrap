package org.vaadin.boostrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;

public interface HasBsHorizontal<T> extends HasStyle {

    String getDefaultClassName();

    default T withHorizontal() {
        addClassName(getDefaultClassName() + "-horizontal");
        return (T) this;
    }
    default T withHorizontalSm() {
        addClassName(getDefaultClassName() + "-horizontal-sm");
        return (T) this;
    }
    default T withHorizontalMd() {
        addClassName(getDefaultClassName() + "-horizontal-md");
        return (T) this;
    }
    default T withHorizontalLg() {
        addClassName(getDefaultClassName() + "-horizontal-lg");
        return (T) this;
    }
    default T withHorizontalXl() {
        addClassName(getDefaultClassName() + "-horizontal-xl");
        return (T) this;
    }
    default T withHorizontalResponsive(BsResponsiveBP responsiveBreakpoint) {
        addClassName(getDefaultClassName() + "-horizontal-"+responsiveBreakpoint.buildClassName());
        return (T) this;
    }
}
