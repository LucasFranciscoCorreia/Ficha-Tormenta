package br.ufrpe.Principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.negocios.Personagem;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;


public class ScreenManager implements Initializable{
	private Personagem personagem;
	private Stage mainStage;
	private Scene defaultScene, warning, campanha;
	private Stage warningStage;
	private Pane pane;
	//private Label warn;
	private static ScreenManager unicInstance;

	private ScreenManager(){
		try {
			defaultScene = new Scene(FXMLLoader.load(getClass().getResource("model/primeirocadastro.fxml")));
			campanha = new Scene(FXMLLoader.load(getClass().getResource("model/campanha.fxml")));
			pane = FXMLLoader.load(getClass().getResource("model/warning.fxml"));
			warningStage = new Stage();
			warning = new Scene(pane);
			warningStage.setScene(warning);
			warningStage.initModality(Modality.APPLICATION_MODAL);
			warningStage.initOwner(mainStage);
			warningStage.setTitle("AVISO");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ScreenManager getInstance(){
		if(unicInstance == null){
			unicInstance = new ScreenManager();
		}
		return unicInstance;
	}
	public void lerPersonagem(){
		try{
			FileInputStream fis = new FileInputStream(new File("src/personagem.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.personagem = (Personagem) ois.readObject();
		}catch(IOException | ClassNotFoundException e){
			personagem = null;
		}
	}

	public void salvarPersonagem(Personagem p){
		try {
			FileOutputStream fout = new FileOutputStream(new File("src/personagem.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void setStage(Stage stage){
		mainStage = stage;
	}

	public Personagem getPersonagem(){
		return this.personagem;
	}
	public void setPersonagem(Personagem P){
		this.personagem = P;
	}
	public void telaInicial(){
		lerPersonagem();
		if(personagem == null){
			mainStage.setScene(defaultScene);
			mainStage.setTitle("Menu Inicial(beta) v1.1");
			mainStage.show();
		}else{
			mainStage.setScene(campanha);
			mainStage.setTitle("Menu Inicial(beta) v1.1");
			mainStage.show();
		}
	}
	public void abrirCampanha(){
		mainStage.setScene(campanha);
	}

	public void showWarning(String warning){
		Label warn = new Label(warning);
		warn.setPrefWidth(140);
		warn.setPrefHeight(152);
		warn.setLayoutX(159);
		warn.setLayoutY(6);
		warn.setTextAlignment(TextAlignment.CENTER);
		warn.setWrapText(true);
		try {
			pane = FXMLLoader.load(getClass().getResource("model/warning.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pane.getChildren().add(warn);
		this.warning = new Scene(pane);
		warningStage.setScene(this.warning);
		warningStage.show();
	}
	public void closeWarning(){
		warningStage.close();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}