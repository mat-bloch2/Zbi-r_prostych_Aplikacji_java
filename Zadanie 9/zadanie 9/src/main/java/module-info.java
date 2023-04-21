module com.example.zadanie9 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.zadanie9 to javafx.fxml;
    exports com.example.zadanie9;
}