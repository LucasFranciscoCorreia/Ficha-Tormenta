package br.ufrpe.Principal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/*from   ww w . j a  v a 2s  .  c  o  m*/
public class Teste extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    Scene scene = new Scene(new Group(), 450, 250);
    TitledPane titledPane = new TitledPane("My Title", new CheckBox("OK"));
    titledPane.setCollapsible(false);//remove closing action
    titledPane.setAnimated(false);//stop animating
    
    HBox hbox = new HBox(10);
    hbox.setPadding(new Insets(20, 0, 0, 20));
    hbox.getChildren().setAll(titledPane);

    Group root = (Group) scene.getRoot();
    root.getChildren().add(hbox);
    stage.setScene(scene);
    stage.show();
  }
}