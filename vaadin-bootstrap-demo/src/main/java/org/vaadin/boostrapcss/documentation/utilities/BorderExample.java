package org.vaadin.boostrapcss.documentation.utilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.demo.BsDemoView;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.enums.BsPosition;
import org.vaadin.boostrapcss.layout.responsive.BsCol;
import org.vaadin.boostrapcss.layout.responsive.BsContainer;
import org.vaadin.boostrapcss.layout.responsive.BsRow;
import org.vaadin.boostrapcss.utils.BorderUtil;

@Route(value = BorderExample.CURRENT_URL)
public class BorderExample extends BsDemoView {

    public static final String CURRENT_URL = "utilities/borders/";

    public BorderExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createBorderColorExample();
        createBorderPositionExample();
        createRoundedExample();
        createRoundedSizeExample();
    }

    private void createBorderColorExample() {
        Div message = createMessageDiv("border-color");
        message.setText("Change the border color using utilities built on our theme colors.");
        // begin-source-example
        // source-example-heading: Border color
        BsContainer layout = new BsContainer();
        BsRow row = layout.addRow();
        row.addClassName("bd-example-col");
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.SECONDARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.SUCCESS);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.DANGER);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.WARNING);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.INFO);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.LIGHT);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.DARK);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.WHITE);

        // end-source-example
        addCodeExample("Border color", layout, message);
    }

    private void createBorderPositionExample() {
        Div message = createMessageDiv("border-position");
        message.setText("Change the border color using utilities built on our theme colors.");
        // begin-source-example
        // source-example-heading: Border position
        BsContainer layout = new BsContainer();
        BsRow row = layout.addRow();
        row.addClassName("bd-example-col");
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.TOP), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.BOTTOM), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.LEFT), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.RIGHT), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.VERTICAL), BsColor.PRIMARY);
        BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize(), BsPosition.HORIZONTAL), BsColor.PRIMARY);
        // end-source-example
        addCodeExample("Border position", layout, message);
    }

    private void createRoundedExample() {
        Div message = createMessageDiv("rounded");
        message.setText("Change the border color using utilities built on our theme colors.");
        // begin-source-example
        // source-example-heading: Border radius
        BsContainer layout = new BsContainer();
        BsRow row = layout.addRow();
        row.addClassName("bd-example-col");
        BorderUtil.withRounded(addDefaultColumn(row),BsPosition.TOP);
        BorderUtil.withRounded(addDefaultColumn(row),BsPosition.BOTTOM);
        BorderUtil.withRounded(addDefaultColumn(row),BsPosition.LEFT);
        BorderUtil.withRounded(addDefaultColumn(row),BsPosition.RIGHT);
        BorderUtil.withRoundedPill(addDefaultColumn(row));
        BorderUtil.withRoundedCircle(addDefaultColumn(row));
        // end-source-example
        addCodeExample("Border radius", layout, message);
    }

    private void createRoundedSizeExample() {
        Div message = createMessageDiv("rounded-size");
        message.setText("You can set larger or smaller border-radius.");
        // begin-source-example
        // source-example-heading: Sizes
        BsContainer layout = new BsContainer();
        BsRow row = layout.addRow();
        row.addClassName("bd-example-col");
        BorderUtil.withRoundedLg(addDefaultColumn(row));
        BorderUtil.withRoundedSm(addDefaultColumn(row));
        // end-source-example
        addCodeExample("Sizes", layout, message);
    }

    private BsCol addDefaultColumn(BsRow row) {
        return BorderUtil.withBorderColor(BorderUtil.withBorder(row.addCol().withEqualSize()), BsColor.PRIMARY);
    }
}
