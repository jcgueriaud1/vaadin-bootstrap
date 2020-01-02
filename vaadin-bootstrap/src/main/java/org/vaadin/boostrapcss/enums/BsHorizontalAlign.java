package org.vaadin.boostrapcss.enums;

public enum BsHorizontalAlign {
    START("start"),
    END("end"),
    CENTER("center"),
    AROUND("around"),
    BETWEEN("between");

    private String align;

    BsHorizontalAlign(final String align) {
        this.align = align;
    }

    public String buildClassName(String prefix) {
        return prefix+ align;
    }
}
