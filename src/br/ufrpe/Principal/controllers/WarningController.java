package br.ufrpe.Principal.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.Principal.ScreenManager;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class WarningController implements Initializable{
	
	static Label warn;
	
	public void fecharAviso(ActionEvent e){
		ScreenManager.getInstance().closeWarning();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
