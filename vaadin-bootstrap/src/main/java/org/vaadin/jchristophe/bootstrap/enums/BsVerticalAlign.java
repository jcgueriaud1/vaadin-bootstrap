package org.vaadin.jchristophe.bootstrap.enums;

public enum BsVerticalAlign {
    START("start"),
    END("end"),
    CENTER("center"),
    BASELINE("baseline"),
    STRETCH("stretch");

    private String align;

    BsVerticalAlign(final String align) {
        this.align = align;
    }

    public String buildClassName(String prefix) {
        return prefix+ align;
    }
}
