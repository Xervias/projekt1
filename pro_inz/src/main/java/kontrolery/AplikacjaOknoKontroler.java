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

public class AplikacjaOknoKontroler {

	@FXML
	private Button button1id;
	
	@FXML
	private Button button2id;
	
	@FXML
	private Button button3id;

	@FXML
	void button1(ActionEvent event) {

		Stage stage = new Stage();
		Scene scena = null;

		Node source = (Node) event.getSource();
		stage = (Stage) source.getScene().getWindow();

		stage.close();

		try {
			scena = new Scene((Parent) FXMLLoader.load(getClass().getResource("/fxml/Option1.fxml")));
		} catch (IOException e) {

			e.printStackTrace();
		}

		stage.setScene(scena);
		stage.show();
	}
	
	@FXML
	void button2(ActionEvent event) {

		Stage stage = new Stage();
		Scene scena = null;

		Node source = (Node) event.getSource();
		stage = (Stage) source.getScene().getWindow();

		stage.close();

		try {
			scena = new Scene((Parent) FXMLLoader.load(getClass().getResource("/fxml/Option2.fxml")));
		} catch (IOException e) {

			e.printStackTrace();
		}

		stage.setScene(scena);
		stage.show();
	}
	
	@FXML
	void button3(ActionEvent event) {

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
