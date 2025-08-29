module com.trangnhk.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.trangnhk.quizzapp to javafx.fxml;
    exports com.trangnhk.quizzapp;
}
