package org.vaadin.boostrapcss.documentation.utilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.demo.BsComponentDemoView;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.enums.BsPosition;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;
import org.vaadin.boostrapcss.layout.responsive.BsCol;
import org.vaadin.boostrapcss.layout.responsive.BsContainer;
import org.vaadin.boostrapcss.layout.responsive.BsRow;
import org.vaadin.boostrapcss.utils.ColorUtil;
import org.vaadin.boostrapcss.utils.DisplayUtil;
import org.vaadin.boostrapcss.utils.SpacingUtil;

@Route(value = SpacingExample.CURRENT_URL)
public class SpacingExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "utilities/spacing/";

    public SpacingExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createMarginExample();
        createPaddingExample();
        createResponsiveExample();
    }

    private void createMarginExample() {
        Div message = createMessageDiv("margin");
        message.setText("You can set your default margin on different sides");
        // begin-source-example
        // source-example-heading: Margin
        Div layout = new Div();
        layout.addClassName("border");
        Div all = new Div();
        all.setText("All 1");
        SpacingUtil.withMargin(all, BsPosition.ALL,1);
        addToLayout(layout, all);
        Div top = new Div();
        top.setText("top 2");
        SpacingUtil.withMargin(top, BsPosition.TOP,2);
        addToLayout(layout, top);
        Div bottom = new Div();
        bottom.setText("bottom 3");
        SpacingUtil.withMargin(bottom, BsPosition.BOTTOM,3);
        addToLayout(layout, bottom);
        Div left = new Div();
        left.setText("left 4");
        SpacingUtil.withMargin(left, BsPosition.LEFT,4);
        addToLayout(layout, left);
        Div right = new Div();
        right.setText("right 5");
        SpacingUtil.withMargin(right, BsPosition.RIGHT,4);
        addToLayout(layout, right);
        Div vertical = new Div();
        vertical.setText("vertical 3");
        SpacingUtil.withMargin(vertical, BsPosition.VERTICAL,3);
        addToLayout(layout, vertical);
        Div horizontal = new Div();
        horizontal.setText("horizontal 3");
        SpacingUtil.withMargin(horizontal, BsPosition.HORIZONTAL,3);
        addToLayout(layout, horizontal);

        // end-source-example
        addCodeExample("Margin", layout, message);
    }

    private void createPaddingExample() {
        Div message = createMessageDiv("padding");
        message.setText("You can set your default padding on different sides");
        // begin-source-example
        // source-example-heading: Padding
        Div layout = new Div();
        layout.addClassName("border");
        Div all = new Div();
        all.setText("All 1");
        SpacingUtil.withPadding(all, BsPosition.ALL,1);
        addToLayout(layout, all);
        Div top = new Div();
        top.setText("top 2");
        SpacingUtil.withPadding(top, BsPosition.TOP,2);
        addToLayout(layout, top);
        Div bottom = new Div();
        bottom.setText("bottom 3");
        SpacingUtil.withPadding(bottom, BsPosition.BOTTOM,3);
        addToLayout(layout, bottom);
        Div left = new Div();
        left.setText("left 4");
        SpacingUtil.withPadding(left, BsPosition.LEFT,4);
        addToLayout(layout, left);
        Div right = new Div();
        right.setText("right 5");
        SpacingUtil.withPadding(right, BsPosition.RIGHT,4);
        addToLayout(layout, right);
        Div vertical = new Div();
        vertical.setText("vertical 3");
        SpacingUtil.withPadding(vertical, BsPosition.VERTICAL,3);
        addToLayout(layout, vertical);
        Div horizontal = new Div();
        horizontal.setText("horizontal 3");
        SpacingUtil.withPadding(horizontal, BsPosition.HORIZONTAL,3);
        addToLayout(layout, horizontal);

        // end-source-example
        addCodeExample("Padding", layout, message);
    }


    private void createResponsiveExample() {
        Div message = createMessageDiv("responsive");
        message.setText("You can change your margin responsively");
        // begin-source-example
        // source-example-heading: Responsive
        BsContainer container = new BsContainer();
        BsRow bsRow = container.addRow();
        BsCol bsCol = bsRow.addCol().withSizes(12)
                .withEqualSize(BsResponsiveBP.LG);
        Div col1 = new Div();
        col1.setText("col 1");
        ColorUtil.withBgColor(col1, BsColor.INFO);
        ColorUtil.withTextColor(col1, BsColor.WHITE);
        bsCol.add(col1);
        BsCol bsCol2 = bsRow.addCol().withSizes(12)
                .withEqualSize(BsResponsiveBP.LG);
        SpacingUtil.withMargin(bsCol2, BsPosition.TOP,5);
        SpacingUtil.withMargin(bsCol2, BsResponsiveBP.LG, BsPosition.TOP,0);
        SpacingUtil.withMargin(bsCol2, BsResponsiveBP.LG, BsPosition.LEFT,5);
        Div col2 = new Div();
        col2.setText("col 2");
        ColorUtil.withBgColor(col2, BsColor.INFO);
        ColorUtil.withTextColor(col2, BsColor.WHITE);
        bsCol2.add(col2);
        // end-source-example
        Div explanationLG = new Div();
        explanationLG.setText("Layout with 2 columns with margin right on the 2nd block. Reduce the width to change it.");
        DisplayUtil.withDisplayBlock(DisplayUtil.withDisplayNone(explanationLG),BsResponsiveBP.LG);
        container.addRow().addCol().add(explanationLG);

        Div explanationMd = new Div();
        explanationMd.setText("Layout with 2 columns with margin top on the 2nd block. Increase the width to change it.");
        explanationMd.addClassNames("d-lg-none");
        DisplayUtil.withDisplayNone(explanationMd, BsResponsiveBP.LG);
        container.addRow().addCol().add(explanationMd);
        addCodeExample("Responsive", container, message);
    }

    /**
     * Add border and bg color to show margin
     *
     * @param layout
     * @param example
     */
    private void addToLayout(Div layout, Div example) {
        Div border = new Div();
        SpacingUtil.withMargin(border, BsPosition.ALL,3);
        border.addClassName("border");
        ColorUtil.withBgColor(border, BsColor.LIGHT);
        ColorUtil.withBgColor(example, BsColor.INFO);
        ColorUtil.withTextColor(example, BsColor.WHITE);
        border.add(example);
        layout.add(border);
    }


}
