package listaSimplesmenteEncadeada;

//Lista simplesmente encadeada

public class SLinkedList {

	protected Node head; // nodo cabe�a da lista
	protected Node tail; // nodo cabe�a da lista
	protected long size; // n�mero de nodos da lista
	Node n = null;

	// Construtor default que cria uma lista vazia

	public SLinkedList() {

		head = tail = null;
		size = 0;

	}

	// --------------------------------------

	public void addNodo(String data) {
		Node novo = new Node(data, n);

		if (head == null) {
			head = novo;
			tail = novo;
		} else {
			tail.setNext(novo);
			tail = novo;
		}
		size++;
	}

	// --------------------------------------

	public String toString() throws EmptyListException {
		String s;

		Node current = head;
		s = "[";
		if (head == null)
			throw new EmptyListException("List is empty.");
		s += current.getElement();
		current = current.getNext();

		for (int i = 0; i <= size - 2; i++) {
			s += ", " + current.getElement();
			current = current.getNext();
		}
		return s + "]";
	}

// --------------------------------------------

	public void inverter() throws EmptyListException {

		if (head == null)
			throw new EmptyListException("List is empty.");

		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
}