package oknadialogowe;

import javafx.scene.control.Alert;

public class Dialog {

	public static void dialogLogowanie() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Logowanie");
		alert.setHeaderText("Wystąpił problem z logowaniem");
		alert.setContentText("Wprowadzono nieprawidłowy login lub hasło");
		alert.showAndWait();
	}
}
