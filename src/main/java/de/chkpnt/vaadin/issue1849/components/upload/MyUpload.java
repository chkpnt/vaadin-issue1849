package de.chkpnt.vaadin.issue1849.components.upload;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.UploadI18N;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;

public class MyUpload extends Upload {

    private MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();

    public MyUpload() {
        setReceiver(buffer);
        addSucceededListener(e -> Notification.show(e.getFileName() + " uploaded!"));
        setI18n(UploadI18nFactory.createForGerman());
    }

    private static class UploadI18nFactory {

        static UploadI18N createForGerman() {
            UploadI18N i18n = new UploadI18N();
            i18n.setAddFiles(new UploadI18N.AddFiles().setOne("Datei auswählen…").setMany("Dateien auswählen…"));
            i18n.setDropFiles(new UploadI18N.DropFiles().setOne("oder hier herziehen").setMany("oder hier herziehen"));
            i18n.setCancel("Abbrechen");
            i18n.setError(new UploadI18N.Error()
                    .setFileIsTooBig("Datei ist zu groß")
                    .setIncorrectFileType("Falscher Dateityp")
                    .setTooManyFiles("Zu viele Dateien")
            );
            i18n.setUploading(new UploadI18N.Uploading()
                    .setStatus(new UploadI18N.Uploading.Status()
                            .setConnecting("Verbindungsaufbau…")
                            .setStalled("Stalled")
                            .setProcessing("Verarbeite Datei…")
                            .setHeld("wartend"))
                    .setRemainingTime(new UploadI18N.Uploading.RemainingTime()
                            .setPrefix("Restliche Zeit: ")
                            .setUnknown("unbekannte restliche Zeit"))
                    .setError(new UploadI18N.Uploading.Error()
                            .setServerUnavailable("Server nicht erreichbar")
                            .setUnexpectedServerError("Unerwarteter Servererror")
                            .setForbidden("Verboten"))
            );
            i18n.setUnits(new UploadI18N.Units());
            return i18n;
        }
    }
}
