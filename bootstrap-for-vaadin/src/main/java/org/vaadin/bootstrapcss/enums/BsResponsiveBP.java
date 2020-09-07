package org.vaadin.bootstrapcss.enums;

public enum BsResponsiveBP implements CssClassName {
    ALL("", ""),
    SM("sm", "-"),
    MD("md", "-"),
    LG("lg", "-"),
    XL("xl", "-");

    private String responsiveBreakPoint;
    private String separator;

    BsResponsiveBP(final String responsiveBreakPoint, final String separator) {
        this.responsiveBreakPoint = responsiveBreakPoint;
        this.separator = separator;
    }

    @Override
    public String buildClassName(int value) {
        return buildClassName(null, value);
    }
    public String buildClassName(String prefix, int value) {
        return ((prefix!=null)?(prefix + "-"):"")+ responsiveBreakPoint + separator + value;
    }

    @Override
    public String buildClassName() {
        return responsiveBreakPoint;
    }

    public String buildClassName(String prefix) {
        return ((prefix!=null)?(prefix + separator):"") + responsiveBreakPoint;
    }

}
