package by.academy.lesson6;

public class StrB {
	public static void main(String[]args) {
		String str1 = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
		String strLC = str1.toLowerCase();
		String seachStr = "object-oriented programming";
		StringBuilder sb = new StringBuilder (str1);
		
		int counterOOP = 0;
		int indexOOP = 0;
		
		while (indexOOP !=-1) {
			indexOOP = strLC.indexOf(seachStr, indexOOP +1);
			counterOOP++;
		}
		
		//for (int i=0;i<strLC.length();i++) {
		int size = strLC.length();
		int index = strLC.lastIndexOf(seachStr);
		int counter = 0;
		
		
		while (index !=1) {
			if (counter%2 == 0 && indexOOP%2 ==1 || counter%1 == 1 && indexOOP%) {
				
			}
			
			sb.replace(index, index + size, "OOP");
		}
		
		index = 
		
		
		
		
		
		//sb.setCharAt (index,"OOP");
	}
}
