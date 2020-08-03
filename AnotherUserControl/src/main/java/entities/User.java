package entities;

import javax.persistence.*;

@Entity
@Table (name = "users")
// описание свойств пользователя - имя, фамилия, логин, пароль и т.д.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // первичный ключ
	private String firstname;
	private String surname;
	private String login;
	private String thePassword; // "password" является ключевым словом в PostgreSQL
	private String about;
	private String adress;
	
	// конструкторы
	public User() {}
	public User(String name, String surname, 
			String login, String password, 
			String about, String adress) 
	{
		this.firstname = name;
		this.surname = surname;
		this.login = login;
		this.thePassword = password;
		this.about = about;
		this.adress = adress;
	}

	// get & set
	String getName() { return this.firstname; }
	String getSurname() { return this.surname; }
	String getAbout() { return this.about; }
	String getAdress() { return this.adress; }
	
	void setName(String value) {this.firstname = value;}
	void setSurname(String value) {this.surname = value;}
	void setLogin(String value) {this.login = value;}
	void setPassword(String value) {this.thePassword = value;}
	void setAbout(String value) {this.about = value;}
	void setAdress(String value) {this.adress = value;}
}
