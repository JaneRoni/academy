package by.academy.lesson7;

/*5. ���� ������:
" Hey      There!     How      Are you doing"   ;
�������� ���� 1 ������ ����� ����.*/

public class L7RegTask5 {
	
	
	
	public static void main(String[]args) {
		String str = " Hey      There!     How      Are you doing";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s+"," "));
	}

}
