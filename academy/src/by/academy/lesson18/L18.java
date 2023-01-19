package by.academy.lesson18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class L18 {

	static String text = "What is Lorem Ipsum?\r\n"
			+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	static String replace = "eyuioa";

	public static final String INPUT_FILE = "file.txt";
	public static final String OUTPUT_FILE = "file2.txt";

	public static void main(String... strings) {

		File inputFile = new File(INPUT_FILE);
//	if (!inputFile.exists()) {
//		inputFile.createNewFile();
//	}

//		File outputFile = new File(OUTPUT_FILE);
		File outputFile2 = new File(OUTPUT_FILE);
//	if (!outputFile.exists()) {
//		outputFile.createNewFile();
//	}

//	try(FileInputStream filein = new FileInputStream(inputFile);
//			OutputStream fileput = new FileOutputStream (outputFile) {
////				String [] text = 
//			
//				for (int i=0;i<text.length();i++) {
//					fileput.write(text);
//				}
//				
//				fileput.flush();
//					
//				int size = filein.available();
//				for (int q=0;q<text.size;q++) {	
//					System.out.println((String)filein.read());
//				}			

		try (BufferedWriter out_bw = new BufferedWriter(new FileWriter(inputFile))) {// input text (BufferedWriter)
			out_bw.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream filein = new FileInputStream(inputFile);
				FileOutputStream fileout = new FileOutputStream(outputFile2)) {
//			int size = filein.available();
//			for (int q=0;q<size;q++) {	

//			}
			int a;
			while ((a = filein.read()) != -1) {
				System.out.println((char)a);
				
				if (replace.contains(INPUT_FILE.valueOf((char) 0).toString())) {//char to string
//					try (BufferedWriter out_bw2 = new BufferedWriter(new FileWriter(outputFile2))){
					fileout.write('!');

				} else {
					fileout.write(a);
				}

//				System.out.println((String)filein.read());

//	try (OutputStream output = new FileOutputStream (outputFile);
//			InputStream input = new FileInputStream(inputFile)){
//		for (int i=0;i<INPUT_FILE.length();i++) {
//			outputFile.
///		}
//			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
