package kontrolery;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainKontroler {

	@FXML
	private StackPane mainStackPane;

	@FXML
	public void initialize() {
		loadMenuOkno();
	}

	public void loadMenuOkno() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuOkno.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setOkno(pane);
	}

	public void setOkno(Pane pane) {
		mainStackPane.getChildren().clear();
		mainStackPane.getChildren().add(pane);
	}

}



















