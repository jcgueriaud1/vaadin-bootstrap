package org.vaadin.bootstrapcss.enums;

public enum BsSize {
    S25("25"),
    S50("50"),
    S75("75"),
    S100("100"),
    SAUTO("auto");

    private String responsiveBreakPoint;

    BsSize(final String responsiveBreakPoint) {
        this.responsiveBreakPoint = responsiveBreakPoint;
    }

    public String buildClassName() {
        return responsiveBreakPoint;
    }
}
