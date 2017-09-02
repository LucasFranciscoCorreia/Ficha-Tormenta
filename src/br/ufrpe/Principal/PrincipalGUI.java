package br.ufrpe.Principal;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalGUI extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		ScreenManager.getInstance().setStage(primaryStage);;
		ScreenManager.getInstance().telaInicial();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
