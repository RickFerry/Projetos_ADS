package view;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CadSoft extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    	Pane painel = new Pane();
        Scene scn = new Scene(painel, 650, 300);
        Label nome = new Label("Nome do Produto:");
        nome.relocate(10, 10);
        Label qntd = new Label("Quantidade:");
        qntd.relocate(10, 50);
        Label dim = new Label("Dimensões:");
        dim.relocate(10, 90);
        Label peso = new Label("Peso:");
        peso.relocate(10, 130);
        Label estoque = new Label("Estoque:");
        estoque.relocate(10, 170);
        
        TextField txtNome = new TextField();
        txtNome.setMinWidth(400);
        txtNome.relocate(200, 10);
        TextField txtQntd = new TextField();
        txtQntd.setMinWidth(400);
        txtQntd.relocate(200, 50);
        TextField d1 = new TextField();
        d1.setMaxWidth(80);
        d1.relocate(200, 90);
        TextField d2 = new TextField();
        d2.setMaxWidth(80);
        d2.relocate(300, 90);
        TextField d3 = new TextField();
        d3.setMaxWidth(80);
        d3.relocate(400, 90);
        

        Slider slider = new Slider(0, 100, 0);
        slider.relocate(200, 130);

        ChoiceBox<String> choicer = new ChoiceBox<String>();
        choicer.setItems(FXCollections.observableArrayList("Central",
        		"Filial 1",
        		"Filial 2",
        		"Depósito"));
        choicer.relocate(200, 170);
        
        Button ok = new Button("Ok");
        ok.relocate(10, 210);
        Button cancel = new Button("Cancel");
        cancel.relocate(70, 210);
        
        painel.getChildren().addAll(nome, qntd, dim, peso, estoque,
        		txtNome, txtQntd, d1, d2, d3, slider, choicer, ok, cancel);
        stage.setScene(scn);
        stage.setTitle("Gestão de Produtos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(CadSoft.class, args);
    }
}