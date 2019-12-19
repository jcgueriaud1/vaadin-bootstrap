package org.vaadin.jchristophe.bootstrap.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.jchristophe.bootstrap.utils.BsVerticalAlign;
import org.vaadin.jchristophe.bootstrap.utils.BsHorizontalAlign;
import org.vaadin.jchristophe.bootstrap.utils.HasBsBgColor;

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
