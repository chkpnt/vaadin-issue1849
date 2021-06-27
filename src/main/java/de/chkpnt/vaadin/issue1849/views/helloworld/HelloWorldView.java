package de.chkpnt.vaadin.issue1849.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.UploadI18N;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import de.chkpnt.vaadin.issue1849.components.upload.MyUpload;
import de.chkpnt.vaadin.issue1849.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@SpringComponent
@UIScope
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PageTitle("Hello World")
public class HelloWorldView extends HorizontalLayout {

    private MyUpload upload = new MyUpload();

    public HelloWorldView() {
        addClassName("hello-world-view");
        add(upload);
    }

}
