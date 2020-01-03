package org.vaadin.boostrapcss.enums;

public enum BsPosition implements CssClassName {
    ALL(""),
    TOP("t"),
    BOTTOM("b"),
    LEFT("l"),
    RIGHT("r"),
    VERTICAL("y"),
    HORIZONTAL("x");

    private String position;

    BsPosition(final String position) {
        this.position = position;
    }

    @Override
    public String buildClassName(int value) {
        return position + "-" + value;
    }

    @Override
    public String buildClassName() {
        return position;
    }

    public String buildClassName(BsResponsiveBP responsiveBP, int value) {
        return position + "-" + responsiveBP.buildClassName(value);
    }

}
