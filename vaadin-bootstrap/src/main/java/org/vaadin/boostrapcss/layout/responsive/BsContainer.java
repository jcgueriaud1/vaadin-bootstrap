package org.vaadin.boostrapcss.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.boostrapcss.mixins.HasBsBgColor;

public class BsContainer extends Div implements HasBsBgColor<BsContainer> {

    public BsContainer() {
        this(false);
    }
    public BsContainer(boolean fluid) {
        addClassName(fluid?"container-fluid":"container");
    }

    public BsRow addRow() {
        BsRow bsRow = new BsRow();
        add(bsRow);
        return bsRow;
    }
}
