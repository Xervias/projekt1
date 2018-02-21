package kontrolery;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Option3Kontroler {

	@FXML
	private Button backid;
	
	@FXML
	private Button reloadid;

	@FXML
	public void back(ActionEvent event) {

		Stage stage = new Stage();
		Scene scena = null;

		Node source = (Node) event.getSource();
		stage = (Stage) source.getScene().getWindow();

		stage.close();

		try {
			scena = new Scene((Parent) FXMLLoader.load(getClass().getResource("/fxml/AplikacjaOkno.fxml")));
		} catch (IOException e) {

			e.printStackTrace();
		}

		stage.setScene(scena);
		stage.show();
	}
	
	@FXML
	void reload(ActionEvent event) {

		Stage stage = new Stage();
		Scene scena = null;

		Node source = (Node) event.getSource();
		stage = (Stage) source.getScene().getWindow();

		stage.close();

		try {
			scena = new Scene((Parent) FXMLLoader.load(getClass().getResource("/fxml/Option3.fxml")));
		} catch (IOException e) {

			e.printStackTrace();
		}

		stage.setScene(scena);
		stage.show();
	}

}
