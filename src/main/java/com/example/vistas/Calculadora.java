package com.example.vistas;

public class Calculadora extends Stage{

    private Button[] arBtns;
    private TextField txtPantalla;
    private GridPane gdpTeclado;
    private VBox vBox;

    private void CrearUI(){
        arBtns = new Button[16];
        txtPantalla = new TextField("0");
        gdpTeclado = new GrindPane();
        vBox = new VBox();
        escena = new Scene();
    }
    public Calculadora(){
        this.setTitle("Calculadora");
        this.setScene();
        this.show();
    }
}
