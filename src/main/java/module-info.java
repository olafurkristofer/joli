module is.vidmot {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens is.vidmot to javafx.fxml, javafx.media;
    exports is.vidmot;
    exports is.vinnsla;
}