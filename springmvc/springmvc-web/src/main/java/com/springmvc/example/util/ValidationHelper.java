package com.springmvc.example.util;

/**
 * The Class ValidationHelper.
 */
public class ValidationHelper {

	/** The Constant BLANK. */
	private static final String BLANK = "";

	/** The Constant EMAIL_REGEX. */
	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * Checks if is blank.
	 *
	 * @param param the param
	 * @return true, if is blank
	 */
	public static boolean isBlank(String param) {
		boolean isBlank = false;
		if (param == null) {
			isBlank = true;
		} else if (param.trim().equals(BLANK)) {
			isBlank = true;
		}
		return isBlank;
	}

	/**
	 * Checks if is valid email.
	 *
	 * @param emailId the email id
	 * @return true, if is valid email
	 */
	public static boolean isValidEmail(String emailId) {
		boolean isValidEmail = true;
		if (!emailId.matches(EMAIL_REGEX)) {
			isValidEmail = false;
		}
		return isValidEmail;
	}

}
