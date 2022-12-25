module com.mycompany.arraystack {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.arraystack to javafx.fxml;
    exports com.mycompany.arraystack;
}
