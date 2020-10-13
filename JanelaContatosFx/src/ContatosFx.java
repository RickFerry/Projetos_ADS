import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ContatosFx extends Application{
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene cena = new Scene(painel, 500, 300);
		
		Label lblTelefone = new Label("Entre com o numero do telefone:");
		Label lblNome = new Label("Entre com seu nome:");
		TextField txtTelefone = new TextField();
		TextField txtNome = new TextField();
		Button btnOk = new Button("Ok");
		Button btnCancel = new Button("Cancel");
		
		lblTelefone.relocate(50, 50);
		txtTelefone.relocate(230, 45);
		lblNome.relocate(50, 100);
		txtNome.relocate(165, 95);
		btnCancel.relocate(380, 250);
		btnOk.relocate(450, 250);
		
		painel.getChildren().addAll(lblTelefone, txtTelefone, lblNome, txtNome, btnCancel, btnOk);
		stage.setScene(cena);
		stage.setTitle("Cadastro de Contatos.");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
