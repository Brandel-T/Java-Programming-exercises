package WS2008_2009;

public class WrongPasswordException extends Exception {
	WrongPasswordException() {}
	WrongPasswordException(String message) {
		super(message);
	}

}
