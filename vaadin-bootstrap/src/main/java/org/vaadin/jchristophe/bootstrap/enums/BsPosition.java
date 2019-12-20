package org.vaadin.jchristophe.bootstrap.enums;

public enum BsPosition implements CssClassName {
    ALL(""),
    TOP("t"),
    BOTTOM("b"),
    LEFT("l"),
    RIGHT("r"),
    VERTICAL("y"),
    HORIZONTAL("x");

    private String size;

    BsPosition(final String size) {
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
