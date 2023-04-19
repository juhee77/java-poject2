module com.example.javaprojtectest2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaprojtectest2 to javafx.fxml;
    exports com.example.javaprojtectest2;
}