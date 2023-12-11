module com.example.dineshb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dineshb to javafx.fxml;
    exports com.example.dineshb;
}