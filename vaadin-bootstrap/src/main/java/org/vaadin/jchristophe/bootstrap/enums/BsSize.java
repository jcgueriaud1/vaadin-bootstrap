package org.vaadin.jchristophe.bootstrap.enums;

public enum BsSize implements CssClassName {
    XS("xs"),
    MD("md"),
    LG("lg"),
    XL("xl");

    private String size;

    BsSize(final String size) {
        this.size = size;
    }

    @Override
    public String buildClassName(int value) {
        return size + "-" + value;
    }

    @Override
    public String buildClassName() {
        return size;
    }
}
