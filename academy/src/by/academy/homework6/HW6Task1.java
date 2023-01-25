package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW6Task1 {

	public static final String INPUT_FILE = "HW6-1.txt";

	public static void main(String... strings) {

		File inputFile = new File(INPUT_FILE);

		Scanner scan = new Scanner(System.in);
		String str = " ";
		System.out.println("Введите текст для записи: ");
		str = scan.nextLine();

		if (str.contains("stop")) {
			System.out.println("Конец записи");
			scan.close();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile))) {
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
