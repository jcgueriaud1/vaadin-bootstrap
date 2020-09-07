package org.vaadin.bootstrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.components.BsButtonGroup;
import org.vaadin.bootstrapcss.components.BsButtonToolbar;
import org.vaadin.bootstrapcss.enums.BsColor;
import org.vaadin.bootstrapcss.enums.BsPosition;
import org.vaadin.bootstrapcss.utils.AriaUtil;
import org.vaadin.bootstrapcss.utils.SpacingUtil;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;

@Route(value = ButtonGroupExample.CURRENT_URL)
public class ButtonGroupExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/button-group/";

    public ButtonGroupExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createButtonToolbar();
    }


    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Wrap a series of buttons in a button group");
        // begin-source-example
        // source-example-heading: Basic Example
        BsButtonGroup buttonGroup = new BsButtonGroup();
        buttonGroup.add(new BsButton("Left").withColor(BsColor.SECONDARY));
        buttonGroup.add(new BsButton("Middle").withColor(BsColor.SECONDARY));
        buttonGroup.add(new BsButton("Right").withColor(BsColor.SECONDARY));
        // end-source-example

        addCodeExample("Basic Example", buttonGroup, message);
    }

    private void createButtonToolbar() {
        Div message = createMessageDiv("toolbar-message");
        message.setText("Combine sets of button groups into button toolbars for more complex components. Use utility classes as needed to space out groups, buttons, and more.");
        // begin-source-example
        // source-example-heading: Toolbar Example
        BsButtonToolbar buttonToolbar = new BsButtonToolbar();
        BsButtonGroup buttonGroup = new BsButtonGroup();
        buttonGroup.add(new BsButton("1").withColor(BsColor.SECONDARY));
        buttonGroup.add(new BsButton("2").withColor(BsColor.SECONDARY));
        buttonGroup.add(new BsButton("3").withColor(BsColor.SECONDARY));
        buttonGroup.add(new BsButton("4").withColor(BsColor.SECONDARY));
        SpacingUtil.withMargin(buttonGroup, BsPosition.RIGHT,2);
        AriaUtil.withAriaLabel(buttonGroup, "First group");
        buttonToolbar.withButtonGroup(buttonGroup);

        BsButtonGroup buttonGroup2 = new BsButtonGroup();
        buttonGroup2.add(new BsButton("5").withColor(BsColor.SECONDARY));
        buttonGroup2.add(new BsButton("6").withColor(BsColor.SECONDARY));
        buttonGroup2.add(new BsButton("7").withColor(BsColor.SECONDARY));
        SpacingUtil.withMargin(buttonGroup2, BsPosition.RIGHT,2);
        AriaUtil.withAriaLabel(buttonGroup2, "Second group");
        buttonToolbar.withButtonGroup(buttonGroup2);

        BsButtonGroup buttonGroup3 = new BsButtonGroup();
        buttonGroup3.add(new BsButton("8").withColor(BsColor.SECONDARY));
        AriaUtil.withAriaLabel(buttonGroup3, "Third group");
        buttonToolbar.withButtonGroup(buttonGroup3);
        // end-source-example

        addCodeExample("Toolbar Example", buttonToolbar, message);
    }
}
