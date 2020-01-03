package org.vaadin.boostrapcss.layout.responsive;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.ElementConstants;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;
import org.vaadin.boostrapcss.enums.BsOffset;
import org.vaadin.boostrapcss.enums.BsVerticalAlign;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;

import java.util.HashMap;
import java.util.Map;

public class BsCol extends Div implements HasBsBgColor<BsCol> {

    private Map<BsResponsiveBP, Integer> sizesPerBreakPoint = new HashMap<>();
    private Map<BsOffset, Integer> offsets = new HashMap<>();

    private static final String COL_CSS_PREFIX = "col";

    public BsCol() {

    }

    public void addFullWidth(Component component) {
        component.getElement().getStyle().set(ElementConstants.STYLE_WIDTH, "100%");
        add(component);
    }

    public BsCol withAutoSize() {
        addClassName(COL_CSS_PREFIX+"-auto");
        return this;
    }

    public BsCol withEqualSize() {
        addClassName(COL_CSS_PREFIX);
        return this;
    }

    public BsCol withEqualSize(BsResponsiveBP responsiveBP) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, 0);
        addClassName(COL_CSS_PREFIX+"-"+responsiveBP.buildClassName());
        return this;
    }

    public BsCol withAutoSize(BsResponsiveBP responsiveBP) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, -1);
        addClassName(COL_CSS_PREFIX+"-"+responsiveBP.buildClassName()+"-auto");
        return this;
    }

    /**
     * Set size per responsive breakpoint
     *
     * @param responsiveBP
     * @param value
     * @return
     */
    public BsCol withSize(BsResponsiveBP responsiveBP, int value) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, value);
        addClassName(responsiveBP.buildClassName(COL_CSS_PREFIX, sizesPerBreakPoint.get(responsiveBP)));
        return this;
    }

    /**
     * Clear size for this responsive breakpoint
     * @param size
     */
    private void clearSize(BsResponsiveBP size) {
        if (sizesPerBreakPoint.containsKey(size)) {
            removeClassName(size.buildClassName(COL_CSS_PREFIX, sizesPerBreakPoint.get(size)));
        }
    }

    public BsCol withOffset(BsOffset offset, int value) {
        clearOffset(offset);
        offsets.put(offset, value);
        addClassName(offset.buildClassName(offsets.get(offset)));
        return this;
    }

    private void clearOffset(BsOffset offset) {
        if (offsets.containsKey(offset)) {
            removeClassName(offset.buildClassName(offsets.get(offset)));
        }
    }

    public BsCol withSizes(int all) {
        return withSize(BsResponsiveBP.ALL, all);
    }

    public BsCol withSizes(int all, int sm) {
        return withSizes(all)
                .withSize(BsResponsiveBP.SM, sm);
    }
    public BsCol withSizes(int all, int sm, int md) {
        return withSizes(all, sm)
                .withSize(BsResponsiveBP.MD, md);
    }
    public BsCol withSizes(int all, int sm, int md, int lg) {
        return withSizes(all, sm, md)
                .withSize(BsResponsiveBP.LG, lg);
    }
    public BsCol withSizes(int all, int sm, int md, int lg, int xl) {
        return withSizes(all, sm, md, lg)
                .withSize(BsResponsiveBP.XL, xl);
    }

    public BsCol withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-self-"));
        return this;
    }

}
