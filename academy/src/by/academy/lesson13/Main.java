package by.academy.lesson13;

//import by.academy.lesson13.User.Query;

public class Main {
	
	public static void main(String...args ){
		
		User user1 = new User("123456","qwerqewt123"); //�����������
//		User.Query query3 = User.new Query(user1);
		
//		User user1 = new User(); //���������
//		user1.createQuery();
		
//		User.Query query3 = user1.new Query();//����������
//		
//		User.Query query2 = new User.Query(user1);//�����������
//		query2.printToLog();
//		
//		query2.printToLog(); //�����������
		
		
		Printable print = new Printable() { //��������� 

			@Override
			public void print() {
				System.out.println("sdasd");
				
			}
			
		};
	}

}
