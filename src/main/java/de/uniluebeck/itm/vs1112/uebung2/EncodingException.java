package de.uniluebeck.itm.vs1112.uebung2;

public class EncodingException extends Exception {

	public EncodingException() {
	}

	public EncodingException(final Throwable cause) {
		super(cause);
	}

	public EncodingException(final String message) {
		super(message);
	}

	public EncodingException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
