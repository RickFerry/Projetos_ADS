import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JanelaHello extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Pane palco = new Pane();
		Scene cena = new Scene(palco, 200, 100);
		Label lblHello = new Label("Hello World.");
		
		palco.getChildren().add(lblHello);
		stage.setScene(cena);
		stage.setTitle("HelloWorld!");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
