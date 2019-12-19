package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsColSize;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsContainer;
import org.vaadin.jchristophe.bootstrap.layout.responsive.BsRow;
import org.vaadin.jchristophe.bootstrap.utils.CollapsibleUtil;

@Route(value ="grid")
public class GridExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createMixAndMatch();
    }

    public void createMixAndMatch() {
        Div message = createMessageDiv("mix-match-message");
        message.setText("Mix and match - responsive grid");

        // begin-source-example
        // source-example-heading: Mix and match Example
        BsContainer container = new BsContainer().withBgLight();
        BsRow row1 = container.addRow();
        row1.addCol().withSizes(12,8, 4).add(new Text("col-12 col-xs-8 col-md-4"));
        row1.addCol().withSizes(12,4, 2).add(new Text("col-12 col-xs-4 col-md-2"));
        row1.addCol().withSizes(12,12, 6).add(new Text("col-12 col-xs-12 col-md-4"));
        BsRow row2 = container.addRow();
        row2.addCol().withSizes(6).add(new Text("col-6"));
        row2.addCol().withSizes(6, 3).add(new Text("col-6 col-xs-3"));
        row2.addCol().withSizes(12,3).add(new Text("col-12 col-xs-3"));
        // end-source-example

        addCard("Mix and match Example", container, message);

    }


}
