package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.bootstrap.components.BsButton;
import org.vaadin.jchristophe.bootstrap.components.BsCard;
import org.vaadin.jchristophe.bootstrap.enums.BsColSize;
import org.vaadin.jchristophe.bootstrap.layout.form.BsFormRow;

@Route(value ="form")
public class FormExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createComplexExample();
    }

    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for form");
        // begin-source-example
        // source-example-heading: Basic Example
        Div form = new Div();
        BsFormRow row = new BsFormRow();
        TextField firstName = new TextField("First Name");
        row.addCol().withSizes(12,6).addFullWidth(firstName);
        TextField lastName = new TextField("Last Name");
        row.addCol().withSizes(12, 6).addFullWidth(lastName);
        form.add(row);
        // end-source-example

        addCard("Basic Example", form, message);
    }
/*
<div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
 */

    private void createComplexExample() {
        Div message = createMessageDiv("complex-message");
        message.setText("Configuration for complex form");
        // begin-source-example
        // source-example-heading: Complex Example
        Div form = new Div();
        BsFormRow row = new BsFormRow();
        EmailField email = new EmailField("Email");
        email.setWidthFull();
        row.addCol().withSizes(12,6).addFullWidth(email);
        PasswordField password = new PasswordField("Password");
        password.setWidthFull();
        row.addCol().withSizes(12, 6).addFullWidth(password);
        form.add(row);
        BsFormRow row2 = new BsFormRow();
        row2.addCol().withAutoSize().addFullWidth(new TextField("Address"));
        form.add(row2);
        BsFormRow row3 = new BsFormRow();
        row3.addCol().withAutoSize().addFullWidth(new TextField("Address 2"));
        form.add(row3);
        BsFormRow row4 = new BsFormRow();
        row4.addCol().withSize(BsColSize.MD,6).addFullWidth(new TextField("City"));
        Select<String> select = new Select<>("City 1 ", "...");
        select.setLabel("City");
        row4.addCol().withSize(BsColSize.MD,4).addFullWidth(select);
        row4.addCol().withSize(BsColSize.MD,2).addFullWidth(new TextField("Zip"));
        form.add(row4);
        BsFormRow row5 = new BsFormRow();
        row5.addCol().addFullWidth(new Checkbox("I agree .... "));
        form.add(row5);
        BsFormRow row6 = new BsFormRow();
        row6.addCol().addFullWidth(new Button("Submit"));
        form.add(row6);
        // end-source-example

        addCard("Complex Example", form, message);
    }

}
