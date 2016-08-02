package com.sameen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by sameenislam on 02/08/2016.
 */
public class MainView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HoReS - Welcome");

        Pane rootPane = new Pane();
        rootPane.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Interface Rapids Hotel");
        scenetitle.relocate(120, 80);
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button reserv = new Button();
        reserv.relocate(105,105);
        reserv.setText("Reservations");

        Button chkInOut = new Button();
        chkInOut.relocate(305,105);
        chkInOut.setText("Check In/Out");

        rootPane.getChildren().addAll(scenetitle, reserv, chkInOut);

        Scene scene = new Scene(rootPane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
