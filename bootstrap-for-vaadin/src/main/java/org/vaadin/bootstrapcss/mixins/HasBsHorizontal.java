package org.vaadin.bootstrapcss.mixins;

import com.vaadin.flow.component.HasStyle;
import org.vaadin.bootstrapcss.enums.BsResponsiveBP;

public interface HasBsHorizontal<T> extends HasStyle {

    String getDefaultClassName();

    default T withHorizontal() {
        return withHorizontal(BsResponsiveBP.ALL);
    }
    default T withHorizontalSm() {
        return withHorizontal(BsResponsiveBP.SM);
    }
    default T withHorizontalMd() {
        return withHorizontal(BsResponsiveBP.MD);
    }
    default T withHorizontalLg() {
        return withHorizontal(BsResponsiveBP.LG);
    }
    default T withHorizontalXl() {
        return withHorizontal(BsResponsiveBP.XL);
    }
    default T withHorizontal(BsResponsiveBP responsiveBreakpoint) {
        addClassName(getDefaultClassName() + "-"+ responsiveBreakpoint.buildClassName("horizontal"));
        return (T) this;
    }
}
