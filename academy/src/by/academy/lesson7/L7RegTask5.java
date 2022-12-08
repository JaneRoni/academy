package by.academy.lesson7;

/*5. ƒана строка:
" Hey      There!     How      Are you doing"   ;
оставить лишь 1 пробел между слов.*/

public class L7RegTask5 {
	
	
	
	public static void main(String[]args) {
		String str = " Hey      There!     How      Are you doing";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s+"," "));
	}

}
