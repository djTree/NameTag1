module com.example.nametag1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nametag1 to javafx.fxml;
    exports com.example.nametag1;
}