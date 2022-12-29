package by.academy.lesson13;

//+1.	—оздать класс User, содержащий private переменные login, password. 

//—оздать внутренний класс Query в классе User.  ласс Query содержит метод
//printToLog(), который распечатывает на консоль сообщение о том что пользователь
//с таким то логином и паролем отправил запрос.  ласс User, содержит метод createQuery(),
//в котором создаетс€ объект класса Query и вызываетс€ метод printToLog(). ¬ методе 
//main(): создать экземпл€р класса User и вызвать метод createQuery(); создать экземпл€р 
//класса Query и вызвать метод printToLog() использу€ конструкцию user.new Query(); создать 
//экземпл€р класса Query и вызвать метод printToLog() использу€ конструкцию new 
//User().new Query(); 
//
//+2.	ѕереписать предыдущее задание, использу€ локальный класс. 
//3.	ѕереписать класс Query использу€ статический класс.
//4.	—оздать анонимный класс расшир€ющий интерфейс Printable. ¬ызвать его метод print().

public class User {

	private String login;
	private String password;
	
//	private static String login;
//	private static String password;
	
	
	public User(String login,String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	
	
//	public class Query{
//		
//		public void printToLog() {
//			System.out.println("пользователь с логином: "+login+" и паролем: "+password+", отправил запрос");
//	
//		}	
//	}
//	
//	public void createQuery() {
//		Query query1 = new Query();
//		query1.printToLog();
//		
//			
//		
//	}

//	public void createQuery() {
//
//		class Query {
//			void printToLog() {
//				System.out.println("пользователь с логином: " + login + " и паролем: " + password + ", отправил запрос");
//			}
//
//		}
//		Query query1 = new Query();
//		query1.printToLog();
//
//	}
	
//	static class Query{//статический
//		
//		 User user;
//		
//		public Query(User user) {
//			super();
//			this.user = user;
//			
//		}
//		
//		public void printToLog() {
//			System.out.println("пользователь с логином: "+user.login+" и паролем: "+user.password+", отправил запрос");
//		}
//		
//}


		
	}
