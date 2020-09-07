package org.vaadin.bootstrapcss.documentation.utilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;
import org.vaadin.bootstrapcss.enums.BsResponsiveBP;
import org.vaadin.bootstrapcss.utils.DisplayUtil;

@Route(value = DisplayExample.CURRENT_URL)
public class DisplayExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "utilities/display/";

    public DisplayExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createDisplayExample();
    }

    private void createDisplayExample() {
        Div message = createMessageDiv("display");
        message.setText("For faster mobile-friendly development, use responsive display classes for showing and hiding elements by device. " +
                "Avoid creating entirely different versions of the same site, instead hide elements responsively for each screen size.");
        // begin-source-example
        // source-example-heading: Display property
        Div layout = new Div();
        Div divLg = new Div();
        divLg.setText("hide on lg and wider screens");
        DisplayUtil.withDisplayNone(divLg, BsResponsiveBP.LG);
        layout.add(divLg);
        Div divSmallerLg = new Div();
        divSmallerLg.setText("hide on screens smaller than lg");
        DisplayUtil.withDisplayBlock(DisplayUtil.withDisplayNone(divSmallerLg), BsResponsiveBP.LG);
        layout.add(divSmallerLg);

        // end-source-example
        addCodeExample("Display property", layout, message);
    }



}
