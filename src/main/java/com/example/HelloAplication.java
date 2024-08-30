package com.example;
import com.example.vistas.Calculadora;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    private BorderPane bdpPrincipal;
    private MenuBar mnbPrincipal;
    private Menu menCompetencia1, menCompetencia2, menCompetencia3;
    private MenuItem mitCalculadora;

    public void CrearUI(){
       mitCalculadora = new MenuItem("Calculadora");
       mitCalculadora.setOnAction(evenr -> new Calculadora());
       menCompetencia1 = new Menu("Competencia1");
        menCompetencia1.getItems().addAll(mitCalculadora);
       mnbPrincipal = new MenuBar(mnbPrincipal);
    }

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        CrearUI();
        Scene scene = new Scene(bdpPrincipal, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}