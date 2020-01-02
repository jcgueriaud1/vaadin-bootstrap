package org.vaadin.boostrapcss.enums;

public enum BsOffset {
    ALL("offset-"),
    XS("offset-xs-"),
    MD("offset-md-"),
    LG("offset-lg-"),
    XL("offset-xl-");

    private String offset;

    BsOffset(final String offset) {
        this.offset = offset;
    }

    public String buildClassName(int value) {
        return offset + value;
    }
}
