package by.academy.lesson17;

public class WrongPasswordException extends Exception{

	
	public WrongPasswordException(){
		super();
	}
	
	public WrongPasswordException(String messege){
		super(messege);
//		this.messege = messege;
	}
}
