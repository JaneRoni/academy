package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Задача 2. Reflection API.
//a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
//b)	Добавить класс User, который наследуется от Person, с полями: login, password, 
//email
//c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User.

//Вывести с помощью 
//рефлексии все поля и методы, сначала через 
//getMethod("name")
//getMethods()
//getField("name")
//getFields()

//а затем через 
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field). 
//Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString 
//через invoke.

public class HW7Task2 {

	public static void main(String... args) {

		User user = new User("User_1", "1245User", "user@gmail.com");
		Person person = new Person("Вася", "Иванов", 23, "21.02.2000");

		Class<Person> personClass = Person.class;
		Class<User> userClass = User.class;

		try {

			// getFields()
			Field[] userFields = userClass.getFields();
			System.out.println(userFields);

			Field[] personFields = personClass.getFields();
			System.out.println(personFields);

			// getField("name")
			Field firstNameFieldPerson = personClass.getField("firstName");
			System.out.println(firstNameFieldPerson);

			Field lastNameFieldPerson = personClass.getField("lastName");
			System.out.println(lastNameFieldPerson);

			Field ageFieldPerson = personClass.getField("age");
			System.out.println(ageFieldPerson);

			Field dateOfBirthFieldPerson = personClass.getField("dateOfBirth");
			System.out.println(dateOfBirthFieldPerson);

			Field emailFieldUser = userClass.getField("email");
			System.out.println(emailFieldUser);
			
			Field passwordFieldUser = userClass.getField("password");
			System.out.println(passwordFieldUser);
			
			Field loginFieldUser = userClass.getField("login");
			System.out.println(loginFieldUser);

			//getMethods()
			
			
			//getMethod("name")
			
			Method setLoginMethod = userClass.getMethod("setLogin", new Class[] { String.class });
			System.out.println(setLoginMethod);

		} catch (NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
