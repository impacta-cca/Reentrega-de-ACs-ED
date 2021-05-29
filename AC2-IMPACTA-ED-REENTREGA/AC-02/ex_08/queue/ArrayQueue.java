package queue;

public class ArrayQueue<E> implements Queue<E> {

	protected E Q[]; // Arranjo usado para implementar a pilha
	protected int N;

	int r = 0;
	int f = r;

	@SuppressWarnings("unchecked")

	public ArrayQueue(int N) {
		this.N = N;
		Q = (E[]) new Object[N];
	}

	@Override
	public int size() {
		return (N - f + r) % N;
	}

	@Override
	public boolean isEmpty() {
		if (r == f) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E front() throws EmptyQueueException {
		if (isEmpty() == true)
			throw new EmptyQueueException("Queue is empty.");
		return Q[f];
	}

	@Override
	public void enqueue(E element) throws FullQueueException {
		if (size() == N - 1)
			throw new FullQueueException("Queue is full.");

		Q[r] = element;
		r = (r + 1) % N;

	}

	@Override
	public E dequeue() throws EmptyQueueException {
		if (isEmpty() == true)
			throw new EmptyQueueException("Queue is empty.");

		E temp = Q[f];
		Q[f] = null;
		f = (f + 1) % N;

		return temp;
	}

	public String toString() {

		String s;

		s = "[";

		if (size() > 0)
			s += Q[0];

		if (size() > 1) {

			for (int i = 1; i <= size() - 1; i++) {

				s += ", " + Q[i];

			}

		}

		return s + "]";

	}

}