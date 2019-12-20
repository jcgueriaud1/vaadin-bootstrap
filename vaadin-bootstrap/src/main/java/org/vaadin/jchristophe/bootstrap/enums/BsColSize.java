package org.vaadin.jchristophe.bootstrap.enums;

public enum BsColSize implements CssClassName {
    ALL("col"),
    SM("col-sm"),
    MD("col-md"),
    LG("col-lg"),
    XL("col-xl");

    private String colSize;

    BsColSize(final String colSize) {
        this.colSize = colSize;
    }

    @Override
    public String buildClassName(int value) {
        return colSize+"-"+value;
    }

    @Override
    public String buildClassName() {
        return colSize;
    }
}
