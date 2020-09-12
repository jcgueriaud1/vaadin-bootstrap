# How to import your bootstrap in a Vaadin application

This article demonstrates three alternative ways to integrate a Bootstrap theme in your Vaadin project.

Note: The demo is loading the bootstrap themes dynamically (to show that you can use different Bootstrap themes).

## Option 1. Use a CDN

Go to the page of your bootstrap theme and follow the CDN installation instructions

For example the official Bootstrap documentation can be found [here](https://getbootstrap.com/docs/4.5/getting-started/download/#bootstrapcdn)

The instructions are:
```
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
```

In you main project, add the annotations on top of your layout:
```
@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js")
```

The instructions for the external dependencies are:
```
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
```
In you main project, add the annotations on top of your layout, before bootstrap js:
```
@JavaScript("https://code.jquery.com/jquery-3.5.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js")
```

Don't forget to add the jquery and popper before bootstrap javascript.

```
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

// add the lumo theme for Vaadin component
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
@PWA(name = "Bootstrap example", shortName = "Bootstrap example", enableInstallPrompt = false)
@JavaScript("https://code.jquery.com/jquery-3.5.1.slim.min.js")
@JavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js")
@StyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css")
@JavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js")
public class MainLayoutWithCDN extends Div implements RouterLayout {

}
```

## Option 2. Use a local webapp folder

Download your favourite Bootstrap theme (Only Bootstrap 4 has been tested).
For example the official Bootstrap theme can be found [here](https://github.com/twbs/bootstrap/releases/download/v4.5.2/bootstrap-4.5.2-dist.zip)

Unzip it in the webapp folder:
* if the project is running in Plain Java (jetty), the folder is *src/webapp*.
* if the project is using Spring Boot, the folder is *src/main/resources/META-INF/resources*

Download jQuery and popper javascript files and and them in the webapp folder.
Import all the needed assets in you layout:

```

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import java.util.HashMap;

// add the lumo theme for Vaadin component
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
@PWA(name = "Bootstrap example", shortName = "Bootstrap example", enableInstallPrompt = false)
public class MainLayout extends Div implements RouterLayout, PageConfigurator {
    @Override
    public void configurePage(InitialPageSettings settings) {
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap.min.css");
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap-grid.min.css");
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap-reboot.min.css");
        addJavascript(settings, "./assets/jquery.min.js");
        addJavascript(settings, "./assets/popper.min.js");
        addJavascript(settings, "./bootstrap-4.5.2-dist/js/bootstrap.min.js");
        addJavascript(settings, "./bootstrap-4.5.2-dist/js/bootstrap.bundle.min.js");
    }

    private void addStylesheet(InitialPageSettings settings, String stylesheet) {
        HashMap<String, String> attributes = new HashMap<>();
        attributes.put("rel", "stylesheet");
        attributes.put("type", "text/css");
        settings.addLink(stylesheet, attributes);

    }
    private void addJavascript(InitialPageSettings settings, String javascript) {
        settings.addInlineWithContents(
            "<script type=\"text/javascript\" defer=\"\" src=\"" +
                javascript +
                "\"></script>",  InitialPageSettings.WrapMode.NONE);

    }
}
```

Note: You can't use `@Javascript` annotation, as there is an issue in Vaadin:
The script will be loaded as a module and jQuery won't be available for Bootstrap.

## Option 3. Use NPM - TODO

This option is more complicated and will require more steps.

I'm not recommending this option as it requires to configure webpack to:
 * transform the bootstrap scss files
 * use jQuery
 
 There is a tutorial to add jQuery in a Vaadin project [here](https://vaadin.com/learn/tutorials/integrate-jquery-into-vaadin-flow)