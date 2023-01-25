package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HW6Task4 {

	public static final String INPUT_FILE = "Task2";
	public static final String OUTPUT = "resulttask4.txt";

	public static void main(String... args) throws IOException {

		File dir = new File("Task4");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (int i = 0; i < 100; i++) {

			String fileName = i + ".txt";
			File file = new File(dir, fileName);

//			System.out.println("create " + i);

			if (!file.exists()) {
				file.createNewFile();

			}
		}

		File inputFile = new File(INPUT_FILE);

		try (FileInputStream filein = new FileInputStream(inputFile)) {

			Scanner s = new Scanner(filein).useDelimiter("\\A");
			String result = s.hasNext() ? s.next() : "";

//			System.out.println(result);
			System.out.println(result.length());

			filein.close();//

			for (int i = 0; i < 100; i++) {

				int random = 0 + (int) (Math.random() * result.length());// число
				String randomIn = result.substring(random);// обрезка по числу

				String openFile = "Task4/" + i + ".txt";
				File inputFile100 = new File(openFile);

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile100))) { // запись
					bw.write(randomIn);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File outputFile = new File(OUTPUT);

		try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(outputFile))) { // запись
			for (int i = 0; i < 100; i++) {
				String totalName = "Task4/" + i + ".txt";
				int totalLen = totalName.length();
				bw2.write("имя: " + totalName + " размер: " + totalLen + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(Arrays.toString(dir.listFiles()));

	}
}
