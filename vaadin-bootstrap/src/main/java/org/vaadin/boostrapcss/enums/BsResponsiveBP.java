package org.vaadin.boostrapcss.enums;

public enum BsResponsiveBP implements CssClassName {
    XS("xs"),
    MD("md"),
    LG("lg"),
    XL("xl");

    private String responsiveBreakPoint;

    BsResponsiveBP(final String responsiveBreakPoint) {
        this.responsiveBreakPoint = responsiveBreakPoint;
    }

    @Override
    public String buildClassName(int value) {
        return responsiveBreakPoint + "-" + value;
    }

    @Override
    public String buildClassName() {
        return responsiveBreakPoint;
    }
}
