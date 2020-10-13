import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JanelaContatos extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		GridPane gride = new GridPane();
		FlowPane flw = new FlowPane();
		Scene cena = new Scene(gride, 500, 150);
		
		gride.add(new Label("Id:"), 0, 0);
		gride.add(new Label("Nome:"), 0, 2);
		gride.add(new Label("Telefone:"), 0, 4);
		
		TextField txtId = new TextField();
		TextField txtNome = new TextField();
		TextField txTelefone = new TextField();
		
		ColumnConstraints coluna1 = new ColumnConstraints();
		coluna1.setPercentWidth(25);
		ColumnConstraints coluna2 = new ColumnConstraints();
		coluna2.setPercentWidth(75);
		gride.getColumnConstraints().addAll(coluna1, coluna2);
		
		gride.add(txtId, 1, 0);
		gride.add(txtNome, 1, 2);
		gride.add(txTelefone, 1, 4);
		gride.add(flw, 0, 8);
		
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		flw.getChildren().addAll(btnSalvar, btnPesquisar);
		
		
		palco.setTitle("Contatos");
		palco.setScene(cena);
		palco.show();
	}	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
