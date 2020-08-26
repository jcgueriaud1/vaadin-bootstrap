package org.vaadin.boostrapcss.demo.theme;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public enum BsTheme implements Serializable {
    DEFAULT("default", "Official Boostrap") {
        public List<String> getStylesheets() {
            List<String> stylesheets = new ArrayList<>();
            stylesheets.add("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css");
            return stylesheets;
        }
        public List<String> getJavascripts() {
            List<String> javascripts = new ArrayList<>();
            javascripts.add("https://code.jquery.com/jquery-3.4.1.slim.min.js");
            javascripts.add("https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js");
            javascripts.add("https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js");
            return javascripts;
        }
        public String getThemeLink() {
            return "https://getbootstrap.com/";
        }
    },
    CORE("core", "Core UI"){

        public List<String> getStylesheets() {
            List<String> stylesheets = new ArrayList<>();
            stylesheets.add("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/css/coreui.min.css");
            return stylesheets;
        }
        public List<String> getJavascripts() {
            List<String> javascripts = new ArrayList<>();
            javascripts.add("https://code.jquery.com/jquery-3.4.1.slim.min.js");
            javascripts.add("https://unpkg.com/@coreui/coreui@3.0.0-beta.1/dist/js/coreui.min.js");
            javascripts.add("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js");
            return javascripts;
        }

        public String getThemeLink() {
            return "https://coreui.io/";
        }
    },
    MDBOOTSTRAP("mdbbootstrap", "MD Bootstrap"){

        public List<String> getStylesheets() {
            List<String> stylesheets = new ArrayList<>();
            stylesheets.add("https://use.fontawesome.com/releases/v5.8.2/css/all.css");
            stylesheets.add("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css");
            stylesheets.add("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/css/mdb.min.css");
            return stylesheets;
        }
        public List<String> getJavascripts() {
            List<String> javascripts = new ArrayList<>();
            javascripts.add("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js");
            javascripts.add("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js");
            javascripts.add("https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js");
            javascripts.add("https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/js/mdb.min.js");
            return javascripts;
        }

        public String getThemeLink() {
            return "https://mdbootstrap.com/";
        }
    },
    ARGON("argon", "Argon Design System"){

        public List<String> getStylesheets() {
            List<String> stylesheets = new ArrayList<>();

            stylesheets.add("./assets/css/nucleo-icons.css");
            stylesheets.add("./assets/css/nucleo-svg.css");
            stylesheets.add("./assets/css/font-awesome.css");
            stylesheets.add("../assets/css/argon-design-system.css?v=1.2.0");
            return stylesheets;
        }
        public List<String> getJavascripts() {
            List<String> javascripts = new ArrayList<>();
            javascripts.add("./assets/js/core/jquery.min.js");
            javascripts.add("./assets/js/core/popper.min.js");
            javascripts.add("./assets/js/core/bootstrap.min.js");
            javascripts.add("./assets/js/plugins/perfect-scrollbar.jquery.min.js");
            javascripts.add("./assets/js/plugins/bootstrap-switch.js");
            javascripts.add("./assets/js/plugins/nouislider.min.js");
            javascripts.add("./assets/js/plugins/moment.min.js");
            javascripts.add("./assets/js/plugins/datetimepicker.js");
            javascripts.add("./assets/js/plugins/bootstrap-datepicker.min.js");
            javascripts.add("./assets/js/argon-design-system.min.js?v=1.2.0");
            return javascripts;
        }

        public String getThemeLink() {
            return "https://demos.creative-tim.com/argon-design-system/";
        }
    };

    private String id;
    private String name;

    BsTheme(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract List<String> getStylesheets();

    public abstract List<String> getJavascripts();

    public abstract String getThemeLink();

}
