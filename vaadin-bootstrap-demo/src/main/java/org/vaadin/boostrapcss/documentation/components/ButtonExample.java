package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.demo.BsComponentDemoView;
import org.vaadin.boostrapcss.enums.BsColor;

@Route(value = ButtonExample.CURRENT_URL)
public class ButtonExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/buttons/";

    public ButtonExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createButtonsOutline();
        createButtonsSize();
    }


    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for buttons");
        // begin-source-example
        // source-example-heading: Basic Example
        Div layout = new Div();
        layout.add(new BsButton("Primary").withColor(BsColor.PRIMARY));
        layout.add(new BsButton("Secondary").withColor(BsColor.SECONDARY));
        layout.add(new BsButton("Success").withColor(BsColor.SUCCESS));
        layout.add(new BsButton("Danger").withColor(BsColor.DANGER));
        layout.add(new BsButton("Warning").withColor(BsColor.WARNING));
        layout.add(new BsButton("Info").withColor(BsColor.INFO));
        layout.add(new BsButton("Light").withColor(BsColor.LIGHT));
        layout.add(new BsButton("Dark").withColor(BsColor.DARK));
        layout.add(new BsButton("Link").withLink());
        // end-source-example

        addCodeExample("Basic Example", layout, message);
    }

    private void createButtonsOutline() {
        Div message = createMessageDiv("outline-message");
        message.setText("Outline colors for buttons");
        // begin-source-example
        // source-example-heading: Outline Example
        Div layout = new Div();
        layout.add(new BsButton("Primary").withOutlineColor(BsColor.PRIMARY));
        layout.add(new BsButton("Secondary").withOutlineColor(BsColor.SECONDARY));
        layout.add(new BsButton("Success").withOutlineColor(BsColor.SUCCESS));
        layout.add(new BsButton("Danger").withOutlineColor(BsColor.DANGER));
        layout.add(new BsButton("Warning").withOutlineColor(BsColor.WARNING));
        layout.add(new BsButton("Info").withOutlineColor(BsColor.INFO));
        layout.add(new BsButton("Light").withOutlineColor(BsColor.LIGHT));
        layout.add(new BsButton("Dark").withOutlineColor(BsColor.DARK));
        // end-source-example

        addCodeExample("Outline Example", layout, message);
    }

    private void createButtonsSize() {
        Div message = createMessageDiv("size-message");
        message.setText("Different sizes for buttons");
        // begin-source-example
        // source-example-heading: Size Example
        Div layout = new Div();
        layout.add(new BsButton("Lg").withColor(BsColor.PRIMARY).withLg());
        layout.add(new BsButton("Sm").withColor(BsColor.SECONDARY).withSm());
        // end-source-example

        addCodeExample("Size Example", layout, message);
    }


}
