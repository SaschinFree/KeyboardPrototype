module za.nmu.keyboardprototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens za.nmu.keyboardprototype to javafx.fxml;
    exports za.nmu.keyboardprototype;
}