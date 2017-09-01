package br.ufrpe.Principal.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import br.ufrpe.negocios.beans.HabilidadeDeClasse;
import br.ufrpe.negocios.beans.Tendencia;
import br.ufrpe.negocios.beans.TracosRaciais;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimeiroCadastroController implements Initializable{

	@FXML
	JFXButton adicionarHabilidade, adicionarTracoRacial, salvarPersonagem, editarHabilidade, editarTraco;

	@FXML
	JFXCheckBox classeMagica;

	@FXML
	JFXComboBox bba, carisma, constituicao, forca, destreza, sabedoria, inteligencia, divindade, tamanho, tendencia, nivel;

	@FXML
	JFXTextField Classe, deslocamento, nomeJogador, nomePersonagem, pmInicial, pmNivel, pvInicial, pvNivel;

	@FXML
	TableView<HabilidadeDeClasse> tabelaHabilidades;

	@FXML
	TableView<TracosRaciais> tracosRaciais;

	@FXML
	TableColumn<HabilidadeDeClasse, String> habilidadeBeneficio;

	@FXML
	TableColumn<HabilidadeDeClasse, String> habilidadeDescricao;

	@FXML
	TableColumn<HabilidadeDeClasse, String> habilidadeNome;

	@FXML
	TableColumn<TracosRaciais, String> tracos;

	@FXML
	TextArea descricaoHabilidade, beneficioHabilidade, habilidadeClasse, raca, tracoRacial;

	List<HabilidadeDeClasse> habilidades;
	
	List<String> tracosR;

	public void gerar(ActionEvent e){
		
	}

	public void addTracoRacial(ActionEvent e){
		if(tracoRacial.getText().isEmpty()){
			//TODO vazio
		}else{
			tracosR.add(tracoRacial.getText());
			TracosRaciais t = new TracosRaciais();
			t.setTracosRaciais(tracosR);
			tracosRaciais.setItems(FXCollections.observableArrayList(t));
		}
	}
	
	public void editarTracoRacial(ActionEvent e){
		
	}
	
	public void editarHabilidade(ActionEvent e){
		
		HabilidadeDeClasse h = tabelaHabilidades.getSelectionModel().getSelectedItem();
		if(h != null){
			descricaoHabilidade.setText(h.getDescricao());
			beneficioHabilidade.setText(h.getBeneficio());
			habilidadeClasse.setText(h.getNome());
			habilidades.remove(h);
			tabelaHabilidades.setItems(FXCollections.observableArrayList(habilidades));
		}else{
			//TODO item nao selecionado
		}
	}

	public void addHabilidade(ActionEvent e){
		if(descricaoHabilidade.getText().isEmpty() || beneficioHabilidade.getText().isEmpty() || habilidadeClasse.getText().isEmpty()){
			//TODO itens faltando
		}else{
			habilidades.add(new HabilidadeDeClasse(habilidadeClasse.getText(), descricaoHabilidade.getText(), beneficioHabilidade.getText()));
			tabelaHabilidades.setItems(FXCollections.observableArrayList(habilidades));
			habilidadeClasse.setText("");
			descricaoHabilidade.setText("");
			beneficioHabilidade.setText("");
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tracosR = new ArrayList<>();
		habilidades = new ArrayList<>();
		habilidadeNome.setCellValueFactory(new PropertyValueFactory<HabilidadeDeClasse,String>("nome"));
		habilidadeNome.setResizable(false);
		habilidadeDescricao.setCellValueFactory(new PropertyValueFactory<HabilidadeDeClasse,String>("descricao"));
		habilidadeDescricao.setResizable(false);
		habilidadeBeneficio.setCellValueFactory(new PropertyValueFactory<HabilidadeDeClasse,String>("beneficio"));
		habilidadeBeneficio.setResizable(false);
		//tracos.setCellValueFactory(new PropertyValueFactory<ArrayList, String>("tracosRaciais"));
		tracos.setResizable(false);
		bba.setItems(FXCollections.observableArrayList("1/2","3/4","1"));
		tamanho.setItems(FXCollections.observableArrayList("Infimo", "Diminuto", "Minimo", "Pequeno", "Medio", "Grande", "Enorme", "Descomunal","Colossal"));
		tendencia.setItems(FXCollections.observableArrayList(Tendencia.values()));
		List<Integer> valores = new ArrayList<>();
		for(int i = 1; i <=20;i++){
			valores.add(i);
		}
		carisma.setItems(FXCollections.observableArrayList(valores));
		forca.setItems(FXCollections.observableArrayList(valores));
		inteligencia.setItems(FXCollections.observableArrayList(valores));
		constituicao.setItems(FXCollections.observableArrayList(valores));
		destreza.setItems(FXCollections.observableArrayList(valores));
		sabedoria.setItems(FXCollections.observableArrayList(valores));
		nivel.setItems(FXCollections.observableArrayList(valores));

	}

}
