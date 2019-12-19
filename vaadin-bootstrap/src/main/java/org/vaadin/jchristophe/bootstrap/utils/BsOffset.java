package org.vaadin.jchristophe.bootstrap.utils;

import org.vaadin.jchristophe.bootstrap.layout.responsive.CssClassName;

public enum BsOffset implements CssClassName {
    ALL("offset-"),
    XS("offset-xs-"),
    MD("offset-md-"),
    LG("offset-lg-"),
    XL("offset-xl-");

    private String offset;

    BsOffset(final String offset) {
        this.offset = offset;
    }

    @Override
    public String buildClassName(int value) {
        return offset + value;
    }
}
