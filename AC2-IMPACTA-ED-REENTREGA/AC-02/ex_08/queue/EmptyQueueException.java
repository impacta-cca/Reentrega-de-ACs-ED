package queue;

@SuppressWarnings("serial")

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super(err);
	}

}