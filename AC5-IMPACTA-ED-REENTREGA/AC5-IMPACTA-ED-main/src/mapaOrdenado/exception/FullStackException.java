package mapaOrdenado.exception;

@SuppressWarnings("serial")

public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super(err);
	}

}