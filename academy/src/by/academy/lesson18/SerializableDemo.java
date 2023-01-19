package by.academy.lesson18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public static void main(String... strings) throws IOException{
		Cat cat = new Cat("Vaska",5);
		
		File file = new File("cat.txt");
		
		
		
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
				ObjectOutputStream oos = new ObjectOutputStream(bos)){
		
	}

}
