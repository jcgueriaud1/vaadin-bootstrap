package org.vaadin.jchristophe.bootstrap.utils;

public enum BsVerticalAlign {
    START("start"),
    END("end"),
    CENTER("center");

    private String align;

    BsVerticalAlign(final String align) {
        this.align = align;
    }

    public String buildClassName(String prefix) {
        return prefix+ align;
    }
}
