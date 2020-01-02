package org.vaadin.boostrapcss.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.boostrapcss.enums.BsSize;
import org.vaadin.boostrapcss.enums.BsVerticalAlign;
import org.vaadin.boostrapcss.enums.BsHorizontalAlign;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;
import org.vaadin.boostrapcss.utils.SizeUtil;

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
