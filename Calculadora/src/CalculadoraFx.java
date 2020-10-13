import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class CalculadoraFx extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		String[] nome = {
				"1", "2", "3", "+",
				"4", "5", "6", "-",
				"7", "8", "9", "*",
				".", "0", "=", "/",
		};
		BorderPane palcoMain = new BorderPane();
		Scene cena = new Scene(palcoMain, 200, 250);
		TilePane palcoBotoes = new TilePane();
		palcoMain.setCenter(palcoBotoes);
		palcoBotoes.setPrefColumns(4);
		
		FlowPane palcoDisplay = new FlowPane();
		palcoMain.setTop(palcoDisplay);
		
		TextField txtDisplay =new TextField();
		Button btnCe = new Button("CE");
		palcoDisplay.getChildren().addAll(txtDisplay, btnCe);
		
		for(int i = 0; i < 16; i++) {
			Button btnTeclas = new Button(nome[i]);
			palcoBotoes.getChildren().add(btnTeclas);
		}
		
		stage.setTitle("Calculadora");
		stage.setScene(cena);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
