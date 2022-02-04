/* ***************************************************************
* Autor............: Tacio Patez Freire
* Matricula........: 202010041
* Inicio...........: 03/01/2022
* Ultima alteracao.: 01/02/2022
* Nome.............: Periodic Fascination
* Funcao...........: E um game voltado para a area da quimica que tem como finalidade
                    o usuario testar seu conhecimento a respeito dos atomos e de suas 
                    camadas eletronicas.
*************************************************************** */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.MainController;
import controller.AtomData;
import controller.GameController;
import model.Atom;

public class Principal extends Application {

  public static void main(String[] args) throws Exception {
    launch(args);
  }

  @Override
  public void start(Stage arg0) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
    Scene scene = new Scene(root);
    arg0.setTitle("Periodic Fascination");
    arg0.setScene(scene);
    arg0.setResizable(false);
    arg0.show();
  }
}
