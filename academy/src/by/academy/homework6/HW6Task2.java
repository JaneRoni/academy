package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class HW6Task2 {

	public static final String INPUT2 = "HW6-2.txt";
	public static final String OUTPUT2 = "result.txt";
	static String replace = " ";

	public static void main(String... strings) {

		File inputFile = new File(INPUT2);

		String task2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
				+ "when an unknown printer took a galley of type and scrambled it to make a type"
				+ "specimen book. It has survived not only five centuries, but also the leap into"
				+ "electronic typesetting, remaining essentially unchanged. It was popularised in"
				+ "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,"
				+ "and more recently with desktop publishing software like Aldus PageMaker including"
				+ "versions of Lorem Ipsum.";

		try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(inputFile))) {
			bw2.write(task2);
			System.out.println("Текст записан");
		} catch (IOException e) {
			e.printStackTrace();
		}

		File outputFile = new File(OUTPUT2);

		try (FileInputStream filein = new FileInputStream(inputFile);
				FileOutputStream fileout = new FileOutputStream(outputFile)) {
			int a;
			while ((a = filein.read()) != -1) {
				System.out.println((char) a);

				if (replace.contains(Character.valueOf((char) a).toString())) {
					fileout.write('_');
				} else {
					fileout.write(a);
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
