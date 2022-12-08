package by.academy.lesson6;

public class L6StrTask1 {
	public static void main(String[]args) {
		String str  = "";
		process (str);
		
		//System.out.println(String.charAt());
	}
	
	public static void process(String str) {
		str  = "I like Java!!!";
		
		System.out.println(str.charAt(11));
		
		if (str.endsWith("!!!")) {
			System.out.println("ends - true");
		}else {
			System.out.println("ends - False");
		}
		
		if (str.startsWith("I like")) {
			System.out.println("start - true");
		}else {
			System.out.println("start - False");
		}
		
		if (str.contains("Java")) {
			System.out.println("contains - true");
		}else {
			System.out.println("contains - False");
		}
		
		System.out.println(str.indexOf("Java"));
		//System.out.println(str.equalsIgnoreCase("Java"));
		
		//for (int i=0;i<str.length();i++) {}
		
		/*int index = str.indexOf("a");
		System.out.println (index);*/
		
		System.out.println(str.replace('a', 'o'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		int q=str.indexOf("J");
		System.out.println(str.subSequence(q, q+4));
	
		
		
		
		}
	
	
}
