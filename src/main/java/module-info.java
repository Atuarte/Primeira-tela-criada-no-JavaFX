module org.example.app_com_interface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires atlantafx.base;


    opens org.example.app_com_interface to javafx.fxml;
    exports org.example.app_com_interface;
}