package by.academy.lesson13;

//+1.	������� ����� User, ���������� private ���������� login, password. 

//������� ���������� ����� Query � ������ User. ����� Query �������� �����
//printToLog(), ������� ������������� �� ������� ��������� � ��� ��� ������������
//� ����� �� ������� � ������� �������� ������. ����� User, �������� ����� createQuery(),
//� ������� ��������� ������ ������ Query � ���������� ����� printToLog(). � ������ 
//main(): ������� ��������� ������ User � ������� ����� createQuery(); ������� ��������� 
//������ Query � ������� ����� printToLog() ��������� ����������� user.new Query(); ������� 
//��������� ������ Query � ������� ����� printToLog() ��������� ����������� new 
//User().new Query(); 
//
//+2.	���������� ���������� �������, ��������� ��������� �����. 
//3.	���������� ����� Query ��������� ����������� �����.
//4.	������� ��������� ����� ����������� ��������� Printable. ������� ��� ����� print().

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
