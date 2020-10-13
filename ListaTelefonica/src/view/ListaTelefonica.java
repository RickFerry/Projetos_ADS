package view;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ListaTelefonica extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    	Pane painel = new Pane();
        Scene scn = new Scene(painel, 650, 240);
        Label id = new Label("Id:");
        id.relocate(10, 10);
        TextField txtId = new TextField();
        txtId.setMinWidth(400);
        txtId.relocate(200, 10);
        Label name = new Label("Nome:");
        name.relocate(10, 50);
        TextField txtName = new TextField();
        txtName.setMinWidth(400);
        txtName.relocate(200, 50);
        Label telefone = new Label("Telefone:");
        telefone.relocate(10, 90);
        TextField txtTelefone = new TextField();
        txtTelefone.setMinWidth(400);
        txtTelefone.relocate(200, 90);
        Button salvar = new Button("Salvar");
        salvar.relocate(10, 120);
        Button pesquisar = new Button("Pesquisar");
        pesquisar.relocate(60, 120);
        painel.getChildren().addAll(id, txtId, name, txtName,
        		telefone, txtTelefone, salvar, pesquisar);
        stage.setScene(scn);
        stage.setTitle("Hello world");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(ListaTelefonica.class, args);
    }
}