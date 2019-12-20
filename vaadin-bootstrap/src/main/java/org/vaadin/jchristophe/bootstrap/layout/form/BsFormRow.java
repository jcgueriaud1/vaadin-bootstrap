package org.vaadin.jchristophe.bootstrap.layout.form;

import com.vaadin.flow.component.html.Div;
import org.vaadin.jchristophe.bootstrap.enums.BsHorizontalAlign;
import org.vaadin.jchristophe.bootstrap.enums.BsVerticalAlign;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsCol;
import org.vaadin.jchristophe.bootstrap.mixins.HasBsBgColor;

public class BsFormRow extends Div implements HasBsBgColor<BsFormRow> {

    public BsFormRow() {
        addClassName("form-row");
    }

    public BsCol addCol() {
        BsCol bsCol = new BsCol();
        bsCol.addClassName("form-group");
        add(bsCol);
        return bsCol;
    }
/*
    public BsCol addColBreak() {
        BsCol bsCol = new BsCol();
        add(bsCol);
        return bsCol;
    }

    public BsFormRow withHorizontalAlign(BsHorizontalAlign align) {
        addClassName(align.buildClassName("justify-content-"));
        return this;
    }

    public BsFormRow withVerticalAlign(BsVerticalAlign align) {
        addClassName(align.buildClassName("align-items-"));
        return this;
    }*/
}
