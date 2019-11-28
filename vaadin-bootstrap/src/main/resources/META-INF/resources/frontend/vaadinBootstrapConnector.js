//window.Sortable = require("sortablejs/Sortable.js");

window.Vaadin.Flow.sortableConnector = {
    initLazy: function (customConfig, c, layout) {
        // Check whether the connector was already initialized
        if (c.$connector) {
            return;
        }

        c.$connector = {
            //// functions
            setOption : function(optionName, optionValue) {
                this.sortable.options[optionName] = optionValue;
            }
        };
        window.Sortable = require("sortablejs/Sortable.js");
        c.$connector.sortable = Sortable.create(layout, customConfig);

        c.$connector.sortable.options.onEnd = function (/**Event*/evt) {
            var itemEl = evt.item;  // dragged HTMLElement
            evt.to;    // target list
            evt.from;  // previous list
            evt.oldIndex;  // element's old index within old parent
            evt.newIndex;  // element's new index within new parent
            evt.oldDraggableIndex; // element's old index within old parent, only counting draggable elements
            evt.newDraggableIndex; // element's new index within new parent, only counting draggable elements
            evt.clone; // the clone element
            evt.pullMode;  // when item is in another sortable: `"clone"` if cloning, `true` if moving
            if (evt.to === evt.from) {
                c.$server.onReorderListener(evt.oldIndex, evt.newIndex);
            } else {
                evt.from.parentElement.$server.onRemoveListener(evt.oldIndex);
                evt.to.parentElement.$server.onAddListener(evt.newIndex);
            }
        }

    }
}