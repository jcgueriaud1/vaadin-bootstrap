# Sortable layout

Sortable layout is a Java add-on to add drag and drop sort on layout (Vaadin Component that implements HasComponents).

This add-on is a vaadin wrapper for sortable js library:

https://github.com/SortableJS/Sortable

## Usage

Starting the test/demo server:
```
// add your layout
VerticalLayout verticalLayout = new VerticalLayout();
// add your elements
for (int i = 0; i < 5; i++) {

    Button button = new Button("btn "+ i);
    button.setId("ID "+ i);
    verticalLayout.add(button);
}
// wrap your layout
SortableLayout sortableLayout = new SortableLayout(verticalLayout);
add(sortableLayout);

sortableLayout.setOnOrderChanged(component -> {
    // do whatever you want when the order has been changed
    // Here Show a notification with the list of ordered components
    StringBuilder ids = new StringBuilder("components ");
    for (Component sortableLayoutComponent : sortableLayout.getComponents()) {
        if (sortableLayoutComponent.getId().isPresent()) {
            ids.append(" ").append(sortableLayoutComponent.getId().get());
        }
    }

    Notification.show(ids.toString());
});
```

This first version does not implement all the configurations of the js library.
You can check the configuration of the js library here:
https://github.com/SortableJS/Sortable

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

## Examples
Sort a list of buttons:

![Card demo](sortable-layout.gif)

Sort a list of cards

![Card demo](sortable-card-demo.gif)
