module com.example.demoone {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demoone to javafx.fxml;
    exports com.example.demoone;
}