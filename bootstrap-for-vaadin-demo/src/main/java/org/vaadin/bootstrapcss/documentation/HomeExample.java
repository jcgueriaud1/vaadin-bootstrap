package org.vaadin.bootstrapcss.documentation;

import com.vaadin.flow.router.Route;
import org.vaadin.bootstrapcss.demo.BsComponentDemoView;

@Route(value = HomeExample.CURRENT_URL)
public class HomeExample extends BsComponentDemoView {

    public static final String CURRENT_URL = "";

    public HomeExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }

    @Override
    protected void initView() {
        super.initView();
    }

}
