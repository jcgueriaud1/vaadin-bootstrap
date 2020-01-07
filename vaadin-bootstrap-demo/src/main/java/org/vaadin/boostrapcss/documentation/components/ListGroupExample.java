package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsListGroup;
import org.vaadin.boostrapcss.components.BsListItem;
import org.vaadin.boostrapcss.demo.BsComponentDemoView;
import org.vaadin.boostrapcss.enums.BsColor;
import org.vaadin.boostrapcss.enums.BsResponsiveBP;

@Route(value = ListGroupExample.CURRENT_URL)
public class ListGroupExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "components/list-group/";

    public ListGroupExample() {
        super(BOOTSTRAP_DOCS_ROOT +CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createColorExample();
        createHorizontalExample();
    }

    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for ListItem");
        // begin-source-example
        // source-example-heading: Basic Example
        BsListGroup listGroup = new BsListGroup();
        listGroup.add(new BsListItem("first item"));
        listGroup.add(new BsListItem("second item"));
        listGroup.add(new BsListItem("third item"));
        listGroup.add(new BsListItem("fourth item"));
        listGroup.add(new BsListItem("active item").withActive());
        listGroup.add(new BsListItem("disabled item").withDisabled());

        // end-source-example

        addCodeExample("Basic Example", listGroup, message);
    }

    private void createColorExample() {
        Div message = createMessageDiv("center-message");
        message.setText("Danger and center for card");
        // begin-source-example
        // source-example-heading: Color Example
        BsListGroup listGroup = new BsListGroup();
        listGroup.add(new BsListItem("first item").withColor(BsColor.PRIMARY));
        listGroup.add(new BsListItem("second item").withColor(BsColor.SECONDARY));
        listGroup.add(new BsListItem("third item").withColor(BsColor.SUCCESS));
        listGroup.add(new BsListItem("fourth item").withColor(BsColor.DANGER));
        listGroup.add(new BsListItem("fifth item").withColor(BsColor.WARNING));
        listGroup.add(new BsListItem("sixth item").withColor(BsColor.INFO));
        listGroup.add(new BsListItem("seventh item").withColor(BsColor.LIGHT));
        listGroup.add(new BsListItem("ninth item").withColor(BsColor.DARK));

        // end-source-example

        addCodeExample("Color Example", listGroup, message);
    }


    private void createHorizontalExample() {
        Div message = createMessageDiv("center-message");
        message.setText("Horizontal if tablet or computer for card");
        // begin-source-example
        // source-example-heading: Horizontal Responsive Example
        BsListGroup listGroup = new BsListGroup().withHorizontal(BsResponsiveBP.MD);
        listGroup.add(new BsListItem("first item"));
        listGroup.add(new BsListItem("second item"));
        listGroup.add(new BsListItem("third item"));
        listGroup.add(new BsListItem("fourth item"));

        // end-source-example

        addCodeExample("Horizontal Responsive Example", listGroup, message);
    }
}
