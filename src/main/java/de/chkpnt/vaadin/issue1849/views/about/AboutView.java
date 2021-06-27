package de.chkpnt.vaadin.issue1849.views.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import de.chkpnt.vaadin.issue1849.components.upload.MyUpload;
import de.chkpnt.vaadin.issue1849.views.MainLayout;

@SpringComponent
@UIScope
@Route(value = "about", layout = MainLayout.class)
@PageTitle("About")
public class AboutView extends Div {

    public AboutView() {
        addClassName("about-view");
    }

}
