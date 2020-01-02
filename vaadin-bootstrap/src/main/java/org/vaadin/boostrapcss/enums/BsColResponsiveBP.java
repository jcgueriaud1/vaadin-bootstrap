package org.vaadin.boostrapcss.enums;

public enum BsColResponsiveBP implements CssClassName {
    ALL("col"),
    SM("col-sm"),
    MD("col-md"),
    LG("col-lg"),
    XL("col-xl");

    private String colResponsiveBP;

    BsColResponsiveBP(final String colResponsiveBP) {
        this.colResponsiveBP = colResponsiveBP;
    }

    @Override
    public String buildClassName(int value) {
        return colResponsiveBP +"-"+value;
    }

    @Override
    public String buildClassName() {
        return colResponsiveBP;
    }
}
