package org.vaadin.bootstrapcss.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.bootstrapcss.enums.BsSize;
import org.vaadin.bootstrapcss.enums.BsVerticalAlign;
import org.vaadin.bootstrapcss.enums.BsHorizontalAlign;
import org.vaadin.bootstrapcss.mixins.HasBsBgColor;
import org.vaadin.bootstrapcss.utils.SizeUtil;

public class BsRow extends Div implements HasBsBgColor<BsRow> {

    public BsRow() {
        addClassName("row");
    }

    public BsRow withNoGutter() {
        addClassName("no-gutters");
        return this;
    }

    public BsCol addCol() {
        BsCol bsCol = new BsCol();
        add(bsCol);
        return bsCol;
    }

    public BsCol addColBreak() {
        BsCol bsCol = new BsCol();
        SizeUtil.withWidth(bsCol, BsSize.S100);
        add(bsCol);
        return bsCol;
    }

    public BsRow withHorizontalAlign(BsHorizontalAlign align) {
        addClassName(align.buildClassName("justify-content-"));
        return this;
    }

    public BsRow withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-items-"));
        return this;
    }
}
