package org.vaadin.jchristophe.bootstrap.layout.responsive;

import com.vaadin.flow.component.html.Div;
import org.vaadin.jchristophe.bootstrap.utils.HasBsBgColor;

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
