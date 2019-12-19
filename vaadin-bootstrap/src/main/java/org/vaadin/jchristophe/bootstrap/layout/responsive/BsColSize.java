package org.vaadin.jchristophe.bootstrap.layout.responsive;

public enum BsColSize implements CssClassName {
    ALL("col-"),
    XS("col-xs-"),
    MD("col-md-"),
    LG("col-lg-"),
    XL("col-xl-");

    private String colSize;

    BsColSize(final String colSize) {
        this.colSize = colSize;
    }

    @Override
    public String buildClassName(int value) {
        return colSize+value;
    }
}
