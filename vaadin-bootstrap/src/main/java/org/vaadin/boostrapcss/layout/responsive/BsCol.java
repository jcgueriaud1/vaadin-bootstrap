package org.vaadin.boostrapcss.layout.responsive;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.ElementConstants;
import org.vaadin.boostrapcss.enums.BsColResponsiveBP;
import org.vaadin.boostrapcss.enums.BsOffset;
import org.vaadin.boostrapcss.enums.BsVerticalAlign;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;

import java.util.HashMap;
import java.util.Map;

public class BsCol extends Div implements HasBsBgColor<BsCol> {

    private Map<BsColResponsiveBP, Integer> sizesPerBreakPoint = new HashMap<>();
    private Map<BsOffset, Integer> offsets = new HashMap<>();

    public BsCol() {

    }

    public void addFullWidth(Component component) {
        component.getElement().getStyle().set(ElementConstants.STYLE_WIDTH, "100%");
        add(component);
    }

    public BsCol withAutoSize() {
        addClassName("col-auto");
        return this;
    }

    public BsCol withEqualSize() {
        addClassName("col");
        return this;
    }

    public BsCol withEqualSize(BsColResponsiveBP responsiveBP) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, 0);
        addClassName(responsiveBP.buildClassName());
        return this;
    }

    public BsCol withAutoSize(BsColResponsiveBP responsiveBP) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, -1);
        addClassName(responsiveBP.buildClassName()+"-auto");
        return this;
    }

    /**
     * Set size per responsive breakpoint
     *
     * @param responsiveBP
     * @param value
     * @return
     */
    public BsCol withSize(BsColResponsiveBP responsiveBP, int value) {
        clearSize(responsiveBP);
        sizesPerBreakPoint.put(responsiveBP, value);
        addClassName(responsiveBP.buildClassName(sizesPerBreakPoint.get(responsiveBP)));
        return this;
    }

    /**
     * Clear size for this responsive breakpoint
     * @param size
     */
    private void clearSize(BsColResponsiveBP size) {
        if (sizesPerBreakPoint.containsKey(size)) {
            removeClassName(size.buildClassName(sizesPerBreakPoint.get(size)));
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
        return withSize(BsColResponsiveBP.ALL, all);
    }

    public BsCol withSizes(int all, int sm) {
        return withSizes(all)
                .withSize(BsColResponsiveBP.SM, sm);
    }
    public BsCol withSizes(int all, int sm, int md) {
        return withSizes(all, sm)
                .withSize(BsColResponsiveBP.MD, md);
    }
    public BsCol withSizes(int all, int sm, int md, int lg) {
        return withSizes(all, sm, md)
                .withSize(BsColResponsiveBP.LG, lg);
    }
    public BsCol withSizes(int all, int sm, int md, int lg, int xl) {
        return withSizes(all, sm, md, lg)
                .withSize(BsColResponsiveBP.XL, xl);
    }

    public BsCol withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-self-"));
        return this;
    }

}
