package by.academy.lesson5;

public class StrLesson5 {
	public static void main(String[] args) {
		String s="��� ������ �� �������� � ����� Java ������������ ������ String,"
				+ "StringBuilder, Stringbuffer";
		
		int index = -1;
		
		do {
			index = s.indexOf('S',index+1);
			if (index >=0) {
					System.out.println(index);
					System.out.println('S');
			}
			
		}while (index >=0);
		
		
		
			
		System.out.print(s);
		System.out.print(" IndexOf (t): "+s.indexOf('t'));
		System.out.print(" IndexOf (e): "+s.lastIndexOf('e'));
		System.out.print(" IndexOf (r,70): "+s.lastIndexOf('r',70));
		
		
	}

}
