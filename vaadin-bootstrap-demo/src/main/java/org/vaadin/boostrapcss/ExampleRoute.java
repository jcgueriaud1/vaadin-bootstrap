package org.vaadin.boostrapcss;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value ="example", layout = BootstrapLayout.class)
public class ExampleRoute extends VerticalLayout {

    public ExampleRoute() {
        /*add(new Button("test"));
        add(new TextField("test"));
        */
        add(new Html("<div> <div class=\"section section-components pb-0\" id=\"section-components\">\n" +
            "      <div class=\"container\">\n" +
            "        <div class=\"row justify-content-center\">\n" +
            "          <div class=\"col-lg-12\">\n" +
            "            <!-- Basic elements -->\n" +
            "            <h2 class=\"mb-5\">\n" +
            "              <span>Basic Elements</span>\n" +
            "            </h2>\n" +
            "            <!-- Buttons -->\n" +
            "            <h3 class=\"h4 text-success font-weight-bold mb-4\">Buttons</h3>\n" +
            "            <!-- Button colors -->\n" +
            "            <div class=\"mb-3 mt-5\">\n" +
            "              <small class=\"text-uppercase font-weight-bold\">Pick your color</small>\n" +
            "            </div>\n" +
            "            <button type=\"button\" class=\"btn btn-primary\">Primary</button>\n" +
            "            <button type=\"button\" class=\"btn btn-info\">Info</button>\n" +
            "            <button type=\"button\" class=\"btn btn-success\">Success</button>\n" +
            "            <button type=\"button\" class=\"btn btn-danger\">Danger</button>\n" +
            "            <button type=\"button\" class=\"btn btn-warning\">Warning</button>\n" +
            "            <button type=\"button\" class=\"btn btn-default\">Default</button>\n" +
            "            <button type=\"button\" class=\"btn btn-secondary\">Secondary</button>\n" +
            "            <div class=\"mb-3 mt-5\">\n" +
            "              <small class=\"text-uppercase font-weight-bold\">Rounded</small>\n" +
            "            </div>\n" +
            "            <button type=\"button\" class=\"btn btn-primary btn-round\">Primary</button>\n" +
            "            <button type=\"button\" class=\"btn btn-info btn-round\">Info</button>\n" +
            "            <button type=\"button\" class=\"btn btn-success btn-round\">Success</button>\n" +
            "            <button type=\"button\" class=\"btn btn-danger btn-round\">Danger</button>\n" +
            "            <button type=\"button\" class=\"btn btn-warning btn-round\">Warning</button>\n" +
            "            <button type=\"button\" class=\"btn btn-default btn-round\">Default</button>\n" +
            "            <button type=\"button\" class=\"btn btn-secondary btn-round\">Secondary</button>\n" +
            "            <div class=\"mb-3 mt-5\">\n" +
            "              <small class=\"text-uppercase font-weight-bold\">Outline</small>\n" +
            "            </div>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-primary\">Primary</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-info\">Info</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-success\">Success</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-danger\">Danger</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-warning\">Warning</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-default\">Default</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-secondary\">Secondary</button>\n" +
            "            <div class=\"mb-3 mt-5\">\n" +
            "              <small class=\"text-uppercase font-weight-bold\">Outline Rounded</small>\n" +
            "            </div>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-primary btn-round\">Primary</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-info btn-round\">Info</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-success btn-round\">Success</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-danger btn-round\">Danger</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-warning btn-round\">Warning</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-default btn-round\">Default</button>\n" +
            "            <button type=\"button\" class=\"btn btn-outline-secondary btn-round\">Secondary</button>\n" +
            "            <!-- Button links -->\n" +
            "            <div class=\"mb-3 mt-5\">\n" +
            "              <small class=\"text-uppercase font-weight-bold\">Links</small>\n" +
            "            </div>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-primary\">Primary</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-info\">Info</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-success\">Success</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-danger\">Danger</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-warning\">Warning</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-default\">Default</button>\n" +
            "            <button type=\"button\" class=\"btn btn-link text-secondary\">Secondary</button>\n" +
            "            <!-- Button styles -->\n" +
            "            <div>\n" +
            "              <div class=\"mb-3 mt-5\">\n" +
            "                <small class=\"text-uppercase font-weight-bold\">Pick your style</small>\n" +
            "              </div>\n" +
            "              <button class=\"btn btn-primary\" type=\"button\">Button</button>\n" +
            "              <button class=\"btn btn-icon btn-3 btn-primary\" type=\"button\">\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "                <span class=\"btn-inner--text\">Left icon</span>\n" +
            "              </button>\n" +
            "              <button class=\"btn btn-icon btn-3 btn-primary\" type=\"button\">\n" +
            "                <span class=\"btn-inner--text\">Right icon</span>\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "              </button>\n" +
            "              <button class=\"btn btn-icon btn-primary\" type=\"button\">\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "              </button>\n" +
            "              <!-- Button sizes -->\n" +
            "              <div class=\"mb-3 mt-5\">\n" +
            "                <small class=\"text-uppercase font-weight-bold\">Pick your size</small>\n" +
            "              </div>\n" +
            "              <button class=\"btn btn-sm btn-primary\" type=\"button\">Small</button>\n" +
            "              <button class=\"btn btn-1 btn-primary\" type=\"button\">Regular</button>\n" +
            "              <button class=\"btn btn-lg btn-primary\" type=\"button\">Large Button</button>\n" +
            "              <div class=\"mb-3 mt-5\">\n" +
            "                <small class=\"text-uppercase font-weight-bold\">Floating</small>\n" +
            "              </div>\n" +
            "              <button class=\"btn btn-sm btn-primary btn-icon-only rounded-circle\" type=\"button\">\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "              </button>\n" +
            "              <button class=\"btn btn-primary btn-icon-only rounded-circle\" type=\"button\">\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "              </button>\n" +
            "              <button class=\"btn btn-lg btn-primary btn-icon-only rounded-circle\" type=\"button\">\n" +
            "                <span class=\"btn-inner--icon\"><i class=\"ni ni-bag-17\"></i></span>\n" +
            "              </button>\n" +
            "            </div>\n" +
            "            <div class=\"row\">\n" +
            "              <div class=\"col-md-6\">\n" +
            "                <div class=\"mb-3 mt-5\">\n" +
            "                  <small class=\"text-uppercase font-weight-bold\">Active & Disabled</small>\n" +
            "                </div>\n" +
            "                <div class=\"row\">\n" +
            "                  <div class=\"col-md-6\">\n" +
            "                    <button class=\"btn btn-primary btn-block active\" type=\"button\">Active</button>\n" +
            "                  </div>\n" +
            "                  <div class=\"col-md-6\">\n" +
            "                    <button class=\"btn btn-primary btn-block disabled\" type=\"button\">Disabled</button>\n" +
            "                  </div>\n" +
            "                </div>\n" +
            "              </div>\n" +
            "              <div class=\"col-md-6\">\n" +
            "                <div class=\"mb-3 mt-5\">\n" +
            "                  <small class=\"text-uppercase font-weight-bold\">Block Level</small>\n" +
            "                </div>\n" +
            "                <div class=\"row\">\n" +
            "                  <button class=\"btn btn-primary btn-block\" type=\"button\">Primary</button>\n" +
            "                  <button class=\"btn btn-info btn-block\" type=\"button\">Info</button>\n" +
            "                </div>\n" +
            "              </div>\n" +
            "            </div>\n" +
            "            <!-- Back to top button -->\n" +
            "            <button class=\"btn btn-primary btn-icon-only back-to-top\" type=\"button\" name=\"button\">\n" +
            "              <i class=\"ni ni-bold-up\"></i>\n" +
            "            </button>\n" +
            "          </div>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div></div>"));
    }
}
