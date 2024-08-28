package com.example;

import javafx.application.Aplication;

public class Main {
    private Button btn1, btn2, btn3;
    private VBox vBox;
    private HBox hBox;

        //GridPane, AnchorPane
    public void CrearUI(){
        btn1 = new Button("Boton 1");
        btn2 = new Button("Boton 2");
        btn3 = new Button("Boton 3");
        vBox = new VBox(btn1, btn2, btn3);
        hBox = new HBox(btn1, btn2, btn3);
    }

    public void start(Stage stage) throws IOException{
        CrearUI();
        Scene scene = new Scene(hBox, 320, 240);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.setMaxi
    }



    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}