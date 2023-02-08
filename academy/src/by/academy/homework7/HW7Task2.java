package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class HW7Task2 {

	public static void main(String... args) {

		User user = new User("User_1", "1245User", "user@gmail.com");
		Person person = new Person("Вася", "Иванов", 23, "21.02.2000");

		Class<User> userClass = User.class;
		Class<Person> personClass = Person.class;
		;

		try {

			// getFields()
			System.out.println("\ngetFields() через user"); // user, person
			Field[] userFields = userClass.getFields();

			for (Field field : userFields) {
				System.out.println(field);
			}

			System.out.println("\ngetFields() через person"); // person
			Field[] personFields = personClass.getFields();

			for (Field field : personFields) {
				System.out.println(field);
			}

			// getDeclaredFields()
			System.out.println("\ngetDeclaredFields()");
			Field[] userFieldsD = userClass.getDeclaredFields();

			for (Field field : userFieldsD) {
				System.out.println(field);
			}

			Field[] personFieldsD = userClass.getSuperclass().getDeclaredFields();

			for (Field field : personFieldsD) {
				System.out.println(field);
			}

			// getMethods()
			System.out.println("\ngetMethods()");
			Method[] userMethods = userClass.getMethods();

			for (Method method : userMethods) {
				System.out.println(method);
			}

			Method[] personMethods = userClass.getSuperclass().getMethods();
			System.out.println(Arrays.toString(personMethods));

			// getDeclaredMethods()
			System.out.println("\ngetDeclaredMethods()");
			Method[] userMethodsD = userClass.getDeclaredMethods();
			System.out.println(Arrays.toString(userMethodsD));

			Method[] personMethodsD = userClass.getSuperclass().getDeclaredMethods();
			System.out.println(Arrays.toString(personMethodsD));

			// getMethod("name")
			System.out.println("\ngetMethod(name)");
			Method setLoginMethodUser = userClass.getMethod("setLogin", new Class[] { String.class });
			System.out.println(setLoginMethodUser);

			Method setAgePerson = userClass.getSuperclass().getMethod("setAge", new Class[] { int.class });
			System.out.println(setAgePerson);

			// getDeclaredMethod("name")
			System.out.println("\ngetDeclaredMethod(\"name\")");
			Method setLoginDMethodUser = userClass.getDeclaredMethod("setLogin", new Class[] { String.class });
			System.out.println(setLoginDMethodUser);

			Method setAgePersonDM = userClass.getSuperclass().getDeclaredMethod("setAge", new Class[] { int.class });
			System.out.println(setAgePersonDM);

			// getField("name")
			System.out.println("\ngetField(name)");
//			Field firstNameFieldPerson = personClass.getField("firstName"); //public Superclass
			Field firstNameFieldPerson = userClass.getSuperclass().getField("firstName");
			System.out.println(firstNameFieldPerson.get(person));
			firstNameFieldPerson.set(person, "ivan");
			System.out.println(firstNameFieldPerson.get(person));

			Field firstNameDFieldPerson = userClass.getSuperclass().getDeclaredField("firstName");
			System.out.println(firstNameDFieldPerson.get(person));

//			Field lastNameFieldPerson = personClass.getField("lastName"); 
			Field lastNameFieldPerson = userClass.getSuperclass().getField("lastName");
			System.out.println(lastNameFieldPerson.get(person));
			lastNameFieldPerson.set(person, "Smirnov");
			System.out.println(lastNameFieldPerson.get(person));

			Field emailFieldUser = userClass.getField("email");
			System.out.println(emailFieldUser.get(user));

			Field loginFieldUser = userClass.getField("login");
			System.out.println(loginFieldUser.get(user));

			Method printUserInfoMethod = userClass.getDeclaredMethod("printUserInfo");
			printUserInfoMethod.setAccessible(true);
			printUserInfoMethod.invoke(user);

			Field ageFieldPerson = userClass.getSuperclass().getField("age"); // protected Superclass
			ageFieldPerson.setAccessible(true);
			int ageFieldPersonVal = ageFieldPerson.getInt(person);

			System.out.println(ageFieldPersonVal);

			Field passwordFieldUser = userClass.getField("password"); // private
			passwordFieldUser.setAccessible(true);

			Field passwordFieldUserMod = passwordFieldUser.getClass().getDeclaredField("modifiers");
			passwordFieldUserMod.setAccessible(true);
			passwordFieldUserMod.setInt(passwordFieldUser, passwordFieldUser.getModifiers() & ~Modifier.FINAL);
			int modifiers = passwordFieldUser.getModifiers();
			passwordFieldUser.set(user, "16453");
			System.out.println(Modifier.isPrivate(modifiers));

			Field dateOfBirthFieldPerson = userClass.getSuperclass().getField("dateOfBirth"); // private Superclass
			dateOfBirthFieldPerson.setAccessible(true);
			System.out.println(dateOfBirthFieldPerson.get(person));
			dateOfBirthFieldPerson.set(person, "01.01.1900");
			System.out.println(dateOfBirthFieldPerson.get(person));

		} catch (NoSuchMethodException | SecurityException | NoSuchFieldException | IllegalArgumentException
				| IllegalAccessException | InvocationTargetException e) {

			e.printStackTrace();

		}

	}

}
