package org.vaadin.boostrapcss.documentation.utilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsDiv;
import org.vaadin.boostrapcss.components.BsParagraph;
import org.vaadin.boostrapcss.demo.BsComponentDemoView;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.enums.BsPosition;
import org.vaadin.boostrapcss.utils.ColorUtil;
import org.vaadin.boostrapcss.utils.SpacingUtil;

@Route(value = ColorExample.CURRENT_URL)
public class ColorExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "utilities/colors/";

    public ColorExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createColorExample();
        createBgColorExample();
        createColorOnComponentExample();
    }

    private void createColorExample() {
        Div message = createMessageDiv("color");
        message.setText("Set the color of an element to any contextual class. ");
        // begin-source-example
        // source-example-heading: Color
        Div layout = new Div();
        SpacingUtil.withPadding(layout, BsPosition.BOTTOM,2);
        BsParagraph primary = new BsParagraph();
        primary.setText("text-primary");
        layout.add(primary.withTextColor(BsColor.PRIMARY));
        BsParagraph secondary = new BsParagraph();
        secondary.setText("text-secondary");
        layout.add(secondary.withTextColor(BsColor.SUCCESS));
        BsParagraph danger = new BsParagraph();
        danger.setText("text-danger");
        layout.add(danger.withTextColor(BsColor.DANGER));
        BsParagraph warning = new BsParagraph();
        warning.setText("text-warning");
        layout.add(warning.withTextColor(BsColor.WARNING));
        BsParagraph info = new BsParagraph();
        info.setText("text-info");
        layout.add(info.withTextColor(BsColor.INFO));
        BsParagraph light = new BsParagraph();
        light.setText("text-light");
        layout.add(light.withTextColor(BsColor.LIGHT).withBgColor(BsColor.DARK));
        BsParagraph dark = new BsParagraph();
        dark.setText("text-dark");
        layout.add(dark.withTextColor(BsColor.DARK));
        BsParagraph white = new BsParagraph();
        white.setText("text-white");
        layout.add(white.withTextColor(BsColor.WHITE).withBgColor(BsColor.DARK));
        // end-source-example

        addCodeExample("Color", layout, message);
    }

    private void createBgColorExample() {
        Div message = createMessageDiv("background-color");
        message.setText("Similar to the contextual text color classes, easily set the background of an element to any contextual class. " +
                "Anchor components will darken on hover, just like the text classes. Background utilities do not set color, so in some cases you’ll want to use .text-* utilities.");
        // begin-source-example
        // source-example-heading: Background Color
        Div layout = new Div();
        SpacingUtil.withPadding(layout, BsPosition.BOTTOM,2);
        BsDiv primary = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        primary.setText("bg-primary");
        layout.add(primary.withBgColor(BsColor.PRIMARY).withTextColor(BsColor.WHITE));
        BsDiv success = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        success.setText("bg-success");
        layout.add(success.withBgColor(BsColor.SUCCESS).withTextColor(BsColor.WHITE));
        BsDiv danger = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        danger.setText("bg-danger");
        layout.add(danger.withBgColor(BsColor.DANGER).withTextColor(BsColor.WHITE));
        BsDiv warning = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        warning.setText("bg-warning");
        layout.add(warning.withBgColor(BsColor.WARNING).withTextColor(BsColor.DARK));
        BsDiv info = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        info.setText("bg-info");
        layout.add(info.withBgColor(BsColor.INFO).withTextColor(BsColor.WHITE));
        BsDiv light = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        light.setText("bg-light");
        layout.add(light.withBgColor(BsColor.LIGHT).withTextColor(BsColor.DARK));
        BsDiv dark = SpacingUtil.withPadding(new BsDiv() ,BsPosition.ALL, 2);
        dark.setText("bg-dark");
        layout.add(dark.withBgColor(BsColor.DARK).withTextColor(BsColor.WHITE));
        // end-source-example

        addCodeExample("Background Color", layout, message);
    }

    private void createColorOnComponentExample() {
        Div message = createMessageDiv("color-on-component");
        message.setText("You can apply color to any components by using ColorUtil");
        // begin-source-example
        // source-example-heading: Color on components
        Div layout = new Div();
        SpacingUtil.withPadding(layout, BsPosition.BOTTOM,2);
        Div primary = new Div();
        SpacingUtil.withPadding(primary,BsPosition.ALL, 2);
        primary.setText("primary");
        ColorUtil.withTextColor(ColorUtil.withBgColor(primary, BsColor.PRIMARY), BsColor.WHITE);
        layout.add(primary);
        // end-source-example

        addCodeExample("Color on components", layout, message);
    }
}
