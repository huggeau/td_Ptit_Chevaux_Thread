module fr.btsciel.td_javafx_thread {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.btsciel.td_javafx_thread to javafx.fxml;
    exports fr.btsciel.td_javafx_thread;
}