package com.example.vistas;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Stage {

    private Button[][] arBtns;
    private TextField txtPantalla;
    private GridPane gdpTeclado;
    private VBox vBox;
    private Scene escena;
    private String[] strTeclas = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

    private void CrearUI(){
        arBtns = new Button[4][4];
        txtPantalla = new TextField("0");
        txtPantalla.setAlignment(Pos.CENTER_RIGHT);
        txtPantalla.setEditable(false);
        gdpTeclado = new GridPane();
        CrearTeclado();
        vBox = new VBox(txtPantalla,gdpTeclado);
        escena = new Scene(vBox,200,200);
    }

    private void CrearTeclado(){
        for (int i = 0; i < arBtns.length; i++) {
            for (int j = 0; j < arBtns.length; j++) {
                arBtns[j][i] = new Button(strTeclas[4*i+j]);
                arBtns[j][i].setPrefSize(50,50);
                int finalI = i;
                int finalJ = j;
                arBtns[j][i].setOnAction(event -> detectarTecla(strTeclas[4* finalI + finalJ]));
                gdpTeclado.add(arBtns[j][i],j,i);
            }
        }
    }

    public Calculadora(){
        CrearUI();
        this.setTitle("Calculadora");
        this.setScene(escena);
        this.show();
    }

    private void detectarTecla(String tecla){
        //txtPantalla.setText("");
        txtPantalla.appendText(tecla);
    }

}
