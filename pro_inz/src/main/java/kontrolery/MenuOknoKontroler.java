package kontrolery;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuOknoKontroler implements Initializable {

	@FXML
	private TextField loginid;

	@FXML
	private PasswordField hasloid;

	@FXML
	private Button logowanie;

	
	public boolean isLogin(String user, String pass) {

		EntityManager em = pro_inz.pro_inz.Main.emf.createEntityManager();
		EntityTransaction transaction = null;

		try {
			transaction = em.getTransaction();
			transaction.begin();

			Query q = em.createQuery("select u from entity.logowanie u where u.login = ?1 and u.password = ?2",
					entity.logowanie.class);
			q.setParameter(1, user);
			q.setParameter(2, pass);

			transaction.commit();

			entity.logowanie le = (entity.logowanie) q.getSingleResult();

			if (user.equalsIgnoreCase(le.getLogin()) && pass.equals(le.getPassword())) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {

			oknadialogowe.Dialog.dialogLogowanie();

			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();

			return false;
		} finally {
			em.close();
		}

	}

	@FXML
	void otworzAlplikacja(ActionEvent event) {

		if (this.isLogin(this.loginid.getText(), this.hasloid.getText())) {

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

		} else

		{
			oknadialogowe.Dialog.dialogLogowanie();
		}

	}

	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
