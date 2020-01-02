package org.vaadin.boostrapcss.enums;

public enum BsColor {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    SUCCESS("success"),
    DANGER("danger"),
    WARNING("warning"),
    INFO("info"),
    LIGHT("light"),
    DARK("dark"),
    WHITE("white");

    private String color;

    BsColor(final String color) {
        this.color = color;
    }

    public String buildClassName() {
        return color;
    }

    public String buildBgClassName() {
        return "bg-"+color;
    }
    public String buildTextClassName() {
        return "text-"+color;
    }
}
