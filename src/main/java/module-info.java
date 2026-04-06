module org.example.app_com_interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.app_com_interface to javafx.fxml;
    exports org.example.app_com_interface;
}