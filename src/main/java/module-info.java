module com.example.sort {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sort to javafx.fxml;
    exports com.example.sort;
}