module com.example.swe3313implementation {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.swe3313implementation to javafx.fxml;
    exports com.example.swe3313implementation;
    exports com.example.swe3313implementation.Controller;
    opens com.example.swe3313implementation.Controller to javafx.fxml;
}