package entity;

import javax.persistence.*;

@Entity
@Table(name = "logowanie", schema = "aplikacja")
public class logowanie {
	private int userId;
	private String login;
	private String password;

	@Id
	@Column(name = "logowanieid")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "login")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Basic
	@Column(name = "haslo")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
