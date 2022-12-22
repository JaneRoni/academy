package by.academy.lesson11;

import java.util.regex.Pattern;

public interface Validator {

	Pattern getPattern();

	default boolean isValid(String todayHB1) {
		return getPattern().matcher(todayHB1).matches();
	}

}
