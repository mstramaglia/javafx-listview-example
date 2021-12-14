module edu.miracosta.javafxlistviewexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.javafxlistviewexample to javafx.fxml;
    exports edu.miracosta.javafxlistviewexample;
}