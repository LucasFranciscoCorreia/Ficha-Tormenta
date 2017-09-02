package br.ufrpe.Principal.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import br.ufrpe.Principal.ScreenManager;
import br.ufrpe.exceptions.ClasseJaCadastradoException;
import br.ufrpe.exceptions.NivelInvalidoException;
import br.ufrpe.negocios.Personagem;
import br.ufrpe.negocios.beans.Classe;
import br.ufrpe.negocios.beans.HabilidadeDeClasse;
import br.ufrpe.negocios.beans.Nivel;
import br.ufrpe.negocios.beans.Raca;
import br.ufrpe.negocios.beans.Tendencia;
import br.ufrpe.negocios.beans.TracosRaciais;
import br.ufrpe.repositorios.Classes;
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


	List<HabilidadeDeClasse> habilidades;
	
	List<TracosRaciais> tracosR;

	@FXML
	JFXCheckBox classeMagica;

	@FXML
	TextArea descricaoHabilidade, beneficioHabilidade, habilidadeClasse, raca, tracoRacial;

	@FXML
	JFXTextField Classe, deslocamento, nomeJogador, nomePersonagem, pmInicial, pmNivel, pvInicial, pvNivel;
	
	@FXML
	JFXComboBox bba, carisma, constituicao, forca, destreza, sabedoria, inteligencia, divindade, tamanho, tendencia, nivel;

	@FXML
	public void salvarPersonagem(ActionEvent e){
		try {
			if(this.nivel.getValue() != null
					&& this.tendencia.getValue() != null
					&& this.tamanho.getValue() != null
					&& this.inteligencia.getValue() != null
					&& this.sabedoria.getValue() != null
					&& this.forca.getValue() != null
					&& this.carisma.getValue() != null
					&& this.destreza.getValue() != null
					&& this.constituicao.getValue() != null
					&& this.bba.getValue() != null
					&& !this.Classe.getText().isEmpty()
					&& !this.deslocamento.getText().isEmpty()
					&& !this.nomeJogador.getText().isEmpty()
					&& !this.nomePersonagem.getText().isEmpty()
					&& !this.pmInicial.getText().isEmpty()
					&& !this.pmNivel.getText().isEmpty()
					&& !this.pvInicial.getText().isEmpty()
					&& !this.pvNivel.getText().isEmpty()
					&& !this.raca.getText().isEmpty()){
				
				Personagem p = new Personagem();
				p.setNivel(new Nivel(Integer.parseInt(nivel.getValue().toString())));
				p.setTendencia(tendencia.getValue().toString());
				p.setTamanho(tamanho.getValue().toString());
				p.setAtributos(Integer.parseInt(forca.getValue().toString()), 
						Integer.parseInt(destreza.getValue().toString()),
						Integer.parseInt(constituicao.getValue().toString()), 
						Integer.parseInt(inteligencia.getValue().toString()), 
						Integer.parseInt(sabedoria.getValue().toString()),
						Integer.parseInt(carisma.getValue().toString()));
				p.setClasses(new Classes());
				p.getClasses().addClasse(new Classe(this.Classe.getText(), 
						this.habilidades,
						(bba.getValue().toString().contains("/") ? (pegarBba(bba.getValue().toString().split("/"))) : 1),
						Byte.parseByte(nivel.getValue().toString()),
						classeMagica.isSelected(),
						Integer.parseInt(pvInicial.getText()),
						Integer.parseInt(pvNivel.getText()),
						Integer.parseInt(pmInicial.getText()),
						Integer.parseInt(pmNivel.getText())));
				p.setRaca(new Raca(raca.getText(), tracosR));
				ScreenManager.getInstance().salvarPersonagem(p);
				ScreenManager.getInstance().abrirCampanha();
			}else{
				ScreenManager.getInstance().showWarning("Preencha todas as lacunas para começar um personagem");
			}
			//ScreenManager.getInstance().setPersonagem(new Personagem());
		} catch (NumberFormatException | NivelInvalidoException | ClasseJaCadastradoException e1) {
			ScreenManager.getInstance().showWarning(e1.getMessage());
		}
	}


	private float pegarBba(String[] split) {
		return ((float) Integer.parseInt(split[0])/Integer.parseInt(split[1]));
	}


	public void addTracoRacial(ActionEvent e){
		if(tracoRacial.getText().isEmpty()){
			ScreenManager.getInstance().showWarning("Escreva algum traço racial para o seu personagem");
		}else{
			tracosR.add(new TracosRaciais(tracoRacial.getText()));
			tracosRaciais.setItems(FXCollections.observableArrayList(tracosR));
			tracoRacial.setText("");
		}
	}
	
	public void editarTracoRacial(ActionEvent e){
		TracosRaciais h = tracosRaciais.getSelectionModel().getSelectedItem();
		if(h != null){
			tracoRacial.setText(h.getTracosRaciais());
			tracosR.remove(h);
			tracosRaciais.setItems(FXCollections.observableArrayList(tracosR));
		}else{
			ScreenManager.getInstance().showWarning("Selecione um traço racial do seu personagem");
		}
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
			ScreenManager.getInstance().showWarning("Selecione uma habilidade para alterar");
		}
	}

	public void addHabilidade(ActionEvent e){
		if(descricaoHabilidade.getText().isEmpty() || beneficioHabilidade.getText().isEmpty() || habilidadeClasse.getText().isEmpty()){
			ScreenManager.getInstance().showWarning("Preencha todos os espaços para adicionar uma habilidade");
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
		
		tracos.setCellValueFactory(new PropertyValueFactory<TracosRaciais, String>("tracosRaciais"));
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
