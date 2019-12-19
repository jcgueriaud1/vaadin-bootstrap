package org.vaadin.jchristophe.bootstrap.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.jchristophe.bootstrap.utils.BsVerticalAlign;
import org.vaadin.jchristophe.bootstrap.utils.BsOffset;
import org.vaadin.jchristophe.bootstrap.utils.HasBsBgColor;

import java.util.HashMap;
import java.util.Map;

public class BsCol extends Div implements HasBsBgColor<BsCol> {

    private Map<BsColSize, Integer> sizes = new HashMap<>();
    private Map<BsOffset, Integer> offsets = new HashMap<>();

    public BsCol() {

    }

    public BsCol withAutoSize() {
        addClassName("col");
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

    public BsCol withSizes(int all, int xs) {
        return withSizes(all)
                .withSize(BsColSize.XS, xs);
    }
    public BsCol withSizes(int all, int xs, int md) {
        return withSizes(all, xs)
                .withSize(BsColSize.MD, md);
    }
    public BsCol withSizes(int all, int xs, int md, int lg) {
        return withSizes(all, xs, md)
                .withSize(BsColSize.LG, lg);
    }
    public BsCol withSizes(int all, int xs, int md, int lg, int xl) {
        return withSizes(all, xs, md, lg)
                .withSize(BsColSize.XL, xl);
    }

    public BsCol withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-self-"));
        return this;
    }

}
