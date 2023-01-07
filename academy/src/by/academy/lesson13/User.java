package by.academy.lesson13;

//+1.	Создать класс User, содержащий private переменные login, password. 

//Создать внутренний класс Query в классе User. Класс Query содержит метод
//printToLog(), который распечатывает на консоль сообщение о том что пользователь
//с таким то логином и паролем отправил запрос. Класс User, содержит метод createQuery(),
//в котором создается объект класса Query и вызывается метод printToLog(). В методе 
//main(): создать экземпляр класса User и вызвать метод createQuery(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 
//
//+2.	Переписать предыдущее задание, используя локальный класс. 
//3.	Переписать класс Query используя статический класс.
//4.	Создать анонимный класс расширяющий интерфейс Printable. Вызвать его метод print().

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
//			System.out.println("������������ � �������: "+login+" � �������: "+password+", �������� ������");
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
//				System.out.println("������������ � �������: " + login + " � �������: " + password + ", �������� ������");
//			}
//
//		}
//		Query query1 = new Query();
//		query1.printToLog();
//
//	}
	
//	static class Query{//�����������
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
//			System.out.println("������������ � �������: "+user.login+" � �������: "+user.password+", �������� ������");
//		}
//		
//}


		
	}
