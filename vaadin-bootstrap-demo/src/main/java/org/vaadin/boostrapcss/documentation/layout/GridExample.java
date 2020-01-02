package org.vaadin.boostrapcss.documentation.layout;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsCard;
import org.vaadin.boostrapcss.demo.BsDemoView;
import org.vaadin.boostrapcss.enums.BsColResponsiveBP;
import org.vaadin.boostrapcss.enums.BsVerticalAlign;
import org.vaadin.boostrapcss.layout.responsive.BsContainer;
import org.vaadin.boostrapcss.layout.responsive.BsRow;

@Route(value = GridExample.CURRENT_URL)
public class GridExample extends BsDemoView {

    public static final String CURRENT_URL = "layout/grid/";

    public GridExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createEqualWidthExample();
        createEqualWidthMultiLineExample();
        createMixAndMatch();
        createCardLayout();
    }

    public void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("The above example creates three equal-width columns on small, medium, large, and extra large devices using our predefined grid classes.");

        // begin-source-example
        // source-example-heading: Basic Example
        BsContainer container = new BsContainer();
        container.addClassName("bd-example-row");
        BsRow row1 = container.addRow();
        row1.addCol().withEqualSize(BsColResponsiveBP.MD).add(new Text("One of three columns"));
        row1.addCol().withEqualSize(BsColResponsiveBP.MD).add(new Text("One of three columns"));
        row1.addCol().withEqualSize(BsColResponsiveBP.MD).add(new Text("One of three columns"));
        // end-source-example

        addCodeExample("Basic Example", container, message);
    }

    public void createEqualWidthExample() {
        Div message = createMessageDiv("equal-width-example");
        message.setText("For example, here are two grid layouts that apply to every device and viewport, from xs to xl. " +
                "Add any number of unit-less classes for each breakpoint you need and every column will be the same width.");

        // begin-source-example
        // source-example-heading: Equal Width Example
        BsContainer container = new BsContainer();
        container.addClassName("bd-example-row");
        BsRow row1 = container.addRow();
        row1.addCol().withEqualSize().add(new Text("1 of 2"));
        row1.addCol().withEqualSize().add(new Text("2 of 2"));
        BsRow row2 = container.addRow();
        row2.addCol().withEqualSize().add(new Text("1 of 3"));
        row2.addCol().withEqualSize().add(new Text("2 of 3"));
        row2.addCol().withEqualSize().add(new Text("3 of 3"));
        // end-source-example

        addCodeExample("Equal Width Example", container, message);
    }

    public void createEqualWidthMultiLineExample() {
        Div message = createMessageDiv("equal-width-multi-line-example");
        message.setText("Create equal-width columns that span multiple lines by inserting a .w-100 where you want the columns to break to a new line. ");

        // begin-source-example
        // source-example-heading: Equal Width Example
        BsContainer container = new BsContainer();
        container.addClassName("bd-example-row");
        BsRow row1 = container.addRow();
        row1.addCol().withEqualSize().add(new Text("col"));
        row1.addCol().withEqualSize().add(new Text("col"));
        row1.addColBreak();
        row1.addCol().withEqualSize().add(new Text("col"));
        row1.addCol().withEqualSize().add(new Text("col"));
        // end-source-example

        addCodeExample("Equal Width Example", container, message);
    }

    public void createMixAndMatch() {
        Div message = createMessageDiv("mix-match-message");
        message.setText("Mix and match - responsive grid");

        // begin-source-example
        // source-example-heading: Mix and match Example
        BsContainer container = new BsContainer();
        container.addClassName("bd-example-row");
        BsRow row1 = container.addRow();
        row1.addCol().withSizes(12,8, 4).add(new Text("col-12 col-xs-8 col-md-4"));
        row1.addCol().withSizes(12,4, 2).add(new Text("col-12 col-xs-4 col-md-2"));
        row1.addCol().withSizes(12,12, 6).add(new Text("col-12 col-xs-12 col-md-4"));
        BsRow row2 = container.addRow();
        row2.addCol().withSizes(6).add(new Text("col-6"));
        row2.addCol().withSizes(6, 3).add(new Text("col-6 col-xs-3"));
        row2.addCol().withSizes(12,3).add(new Text("col-12 col-xs-3"));
        // end-source-example

        addCodeExample("Mix and match Example", container, message);

    }

    public void createCardLayout() {
        Div message = createMessageDiv("card-message");
        message.setText("Card layout - responsive grid");

        // begin-source-example
        // source-example-heading: Card layout Example
        BsContainer container = new BsContainer(true);
        BsRow row = container.addRow().withVerticalAlign(BsVerticalAlign.CENTER);
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 1"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 2"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 3"));
        row.addCol().withSizes(12,12, 12, 8, 6).add(buildCardDemo("Double size card 4"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 5"));
        row.addCol().withSizes(12,6, 6, 4 , 3).add(buildCardDemo("Card 6"));

        // end-source-example

        addCodeExample("Card layout Example", container, message);

    }


    private BsCard buildCardDemo(String title) {
        BsCard card = new BsCard();
        card.setCardHeaderText(title);
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        return card;
    }

}
