package ex05;

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}
}
