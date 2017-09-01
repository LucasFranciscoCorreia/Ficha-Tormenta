package br.ufrpe.Principal;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalGUI extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("model/primeirocadastro.fxml")));
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
