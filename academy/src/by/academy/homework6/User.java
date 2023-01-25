package by.academy.homework6;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1l;

//	+Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
//	+В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//	Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//	Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в 
//	файл пользователя. Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки
//	на экран (System.err.println(e.getMessage());)

	String name;
	String surname;
	int old;

	public User(String name, String surname, int old) {
		super();
		this.name = name;
		this.surname = surname;
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

}
