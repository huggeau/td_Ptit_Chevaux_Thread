package fr.btsciel.td_javafx_thread;


import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Button goButton;
    public TextField textFieldYellow;
    public TextField textFieldRed;
    public TextField textFieldBlue;
    public Circle yellowCircle;
    public Circle redCircle;
    public Circle blueCircle;
    public Coureur c1 = new Coureur("Batout", 10);
    public Coureur c2 = new Coureur("Luca", 10);
    public Coureur c3 = new Coureur("Mael", 10);


    @Override
    public void initialize(URL location, ResourceBundle resources) {
            goButton.setOnAction(event -> LaunchRun());

    }

    private void LaunchRun() {
        blueCircle.setCenterX(+1);
        new Thread(()->c1.run()).start();
        new Thread(()->c2.run()).start();
        new Thread(()->c3.run()).start();

    }
}