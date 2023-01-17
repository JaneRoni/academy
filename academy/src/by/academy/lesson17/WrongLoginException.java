package by.academy.lesson17;

public class WrongLoginException extends Exception {

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String messege) {
		super(messege);
//		this.messege = messege;
	}

}
