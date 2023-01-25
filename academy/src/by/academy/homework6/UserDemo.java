package by.academy.homework6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDemo {
	public static void main(String... args) throws IOException {

		ArrayList<User> arrayUser = new ArrayList<>();

		arrayUser.add(0, new User("Иван", "Морозов", 15));
		arrayUser.add(1, new User("Петр", "Егоров", 30));
		arrayUser.add(2, new User("Василий", "Аксёнов", 17));
		arrayUser.add(3, new User("Демьян", "Алексеев", 35));
		arrayUser.add(4, new User("Олег", "Иванов", 32));
		arrayUser.add(5, new User("Андрей", "Смирнов", 33));
		arrayUser.add(6, new User("Руслан", "Кузнецов", 19));
		arrayUser.add(7, new User("Денис", "Попов", 60));
		arrayUser.add(8, new User("Евгений", "Лебедев", 50));
		arrayUser.add(9, new User("Виктор", "Козлов", 47));

		File dir = new File("users");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (int i = 0; i < arrayUser.size(); i++) {
			String fileName = arrayUser.get(i).name + "_" + arrayUser.get(i).surname + ".txt";
			File file = new File(dir, fileName);

			System.out.println(arrayUser.get(i).name + "_" + arrayUser.get(i).surname + ".txt");

			if (!file.exists()) {
				file.createNewFile();

			}

			try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
					ObjectOutputStream oos = new ObjectOutputStream(bos)) {
				oos.writeObject(arrayUser.get(i));

				System.out.println("done " + i);

			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}
	}
}
