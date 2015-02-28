package com.springmvc.example.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringMVCException.
 */
public class SpringMVCException extends Exception {

	/**
	 * Instantiates a new spring mvc exception.
	 */
	public SpringMVCException() {
		super();
	}

	/**
	 * Instantiates a new spring mvc exception.
	 *
	 * @param message the message
	 */
	public SpringMVCException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new spring mvc exception.
	 *
	 * @param message the message
	 * @param t the t
	 */
	public SpringMVCException(String message, Throwable t) {
		super(message, t);
	}

	/**
	 * Instantiates a new spring mvc exception.
	 *
	 * @param t the t
	 */
	public SpringMVCException(Throwable t) {
		super(t);
	}

}
