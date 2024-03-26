package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import exceptions.BirthDayException;
import exceptions.EmailException;
import exceptions.FullNameException;
import exceptions.PhoneException;

public class Validation {
	private static String PHONE_REGEX = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
	private static String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	private static String NAME_REGEX = "^[a-zA-Z\\s]+$";

	public boolean isValidPhone(String input) throws PhoneException {
		if (input.matches(PHONE_REGEX)) {
			return true;
		} else {
			throw new PhoneException("Invalid phone number");
		}
	}

	public boolean isValidEmail(String input) throws EmailException {
		if (input.matches(EMAIL_REGEX)) {
			return true;
		} else {
			throw new EmailException("Invalid Email");
		}
	}

	public boolean isValidBirthDate(String input) throws BirthDayException {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate.parse(input, dateFormatter);
			return true;
		} catch (Exception e) {
			throw new BirthDayException("Invalid BirthDate");
		}
	}

	public boolean isValidName(String input) throws FullNameException {
		if (input.matches(NAME_REGEX)) {
			return true;
		} else {
			throw new FullNameException("Invalid Name");
		}
	}

}
