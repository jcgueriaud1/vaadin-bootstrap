package org.vaadin.jchristophe.bootstrap.layout.responsive;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.ElementConstants;
import org.vaadin.jchristophe.bootstrap.enums.BsColSize;
import org.vaadin.jchristophe.bootstrap.enums.BsOffset;
import org.vaadin.jchristophe.bootstrap.enums.BsVerticalAlign;
import org.vaadin.jchristophe.bootstrap.mixins.HasBsBgColor;

import java.util.HashMap;
import java.util.Map;

public class BsCol extends Div implements HasBsBgColor<BsCol> {

    private Map<BsColSize, Integer> sizes = new HashMap<>();
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

    public BsCol withEqualSize(BsColSize size) {
        clearSize(size);
        sizes.put(size, 0);
        addClassName(size.buildClassName());
        return this;
    }

    public BsCol withAutoSize(BsColSize size) {
        clearSize(size);
        sizes.put(size, -1);
        addClassName(size.buildClassName()+"-auto");
        return this;
    }

    public BsCol withSize(BsColSize size, int value) {
        clearSize(size);
        sizes.put(size, value);
        addClassName(size.buildClassName(sizes.get(size)));
        return this;
    }

    private void clearSize(BsColSize size) {
        if (sizes.containsKey(size)) {
            removeClassName(size.buildClassName(sizes.get(size)));
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
        return withSize(BsColSize.ALL, all);
    }

    public BsCol withSizes(int all, int sm) {
        return withSizes(all)
                .withSize(BsColSize.SM, sm);
    }
    public BsCol withSizes(int all, int sm, int md) {
        return withSizes(all, sm)
                .withSize(BsColSize.MD, md);
    }
    public BsCol withSizes(int all, int sm, int md, int lg) {
        return withSizes(all, sm, md)
                .withSize(BsColSize.LG, lg);
    }
    public BsCol withSizes(int all, int sm, int md, int lg, int xl) {
        return withSizes(all, sm, md, lg)
                .withSize(BsColSize.XL, xl);
    }

    public BsCol withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-self-"));
        return this;
    }

}
