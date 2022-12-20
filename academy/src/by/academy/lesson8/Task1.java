package by.academy.lesson8;

public class Task1 {
	public static void main (String...args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();

		phone1.model = "1256";
		phone1.number = 14785296;
		phone1.weight = 10.02;
		phone1.name = "Олег";
		
		
		phone2.model = "2345";
		phone2.number = 14532876;
		phone2.weight = 11.02;
		phone2.name = "Маша";
		
		phone3.model = "5678";
		phone3.number = 14537676;
		phone3.weight = 12.02;
		phone3.name = "Даша";
		
		//System.out.println(phone1);
		System.out.println(phone1.model+" "+phone1.number+" "+phone1.weight+" ");
		
		//System.out.println(phone1.receiveCall(phone1.name));
		System.out.println(phone1.getNumber() + " "+phone2.getNumber()+" "+phone3.getNumber());
		
		
	}
	

}
