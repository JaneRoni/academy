package by.academy.lesson11;

import java.util.regex.Pattern;

public class HBvalidator implements Validator{
	
	private static final Pattern day = Pattern.compile("[0-9]");
	
	@Override 
	public Pattern getPattern() {
		return day;
	}

}
