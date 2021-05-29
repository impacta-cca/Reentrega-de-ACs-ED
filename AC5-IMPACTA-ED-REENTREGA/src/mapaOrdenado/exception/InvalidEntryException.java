package mapaOrdenado.exception;


@SuppressWarnings("serial")

public class InvalidEntryException extends RuntimeException {
	public InvalidEntryException(String err) {
		super(err);
	}
}
