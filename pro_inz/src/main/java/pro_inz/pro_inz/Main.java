package pro_inz.pro_inz;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static EntityManagerFactory emf;

	public static void main(String[] args) {
		launch(args);
		emf.close();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		emf = Persistence.createEntityManagerFactory("aplikacja");
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainOkno.fxml"));
		StackPane stackPane = loader.load();
		Scene scene = new Scene(stackPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Magazynier");
		primaryStage.setResizable(false);
		primaryStage.show();

	}
}
