package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.components.BsCard;
import org.vaadin.jchristophe.bootstrap.components.BsListGroup;
import org.vaadin.jchristophe.bootstrap.components.BsListItem;

@Route(value ="listGroup")
public class ListGroupExample extends BsDemoView {

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

        addCard("Basic Example", listGroup, message);
    }

    private void createColorExample() {
        Div message = createMessageDiv("center-message");
        message.setText("Danger and center for card");
        // begin-source-example
        // source-example-heading: Color Example
        BsListGroup listGroup = new BsListGroup();
        listGroup.add(new BsListItem("first item").withPrimary());
        listGroup.add(new BsListItem("second item").withSecondary());
        listGroup.add(new BsListItem("third item").withSuccess());
        listGroup.add(new BsListItem("fourth item").withDanger());
        listGroup.add(new BsListItem("fifth item").withWarning());
        listGroup.add(new BsListItem("sixth item").withInfo());
        listGroup.add(new BsListItem("seventh item").withLight());
        listGroup.add(new BsListItem("ninth item").withDark());

        // end-source-example

        addCard("Color Example", listGroup, message);
    }


    private void createHorizontalExample() {
        Div message = createMessageDiv("center-message");
        message.setText("Horizontal if tablet or computer for card");
        // begin-source-example
        // source-example-heading: Horizontal Responsive Example
        BsListGroup listGroup = new BsListGroup().withHorizontalMd();
        listGroup.add(new BsListItem("first item"));
        listGroup.add(new BsListItem("second item"));
        listGroup.add(new BsListItem("third item"));
        listGroup.add(new BsListItem("fourth item"));

        // end-source-example

        addCard("Horizontal Responsive Example", listGroup, message);
    }
}
