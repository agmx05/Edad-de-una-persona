module com.mycompany.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.edad to javafx.fxml;
    exports com.mycompany.edad;
}
