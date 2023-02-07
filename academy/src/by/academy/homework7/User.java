package by.academy.homework7;

public class User extends Person {

	public String login;
	private String password;
	public String email;

	public User() {
		super();
	}

	public User(String l, String p, String e) {
		this();
		this.login = l;
		this.password = p;
		this.email = e;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("login: " + login + ", password: " + password + ", email: " + email);

	}
}
