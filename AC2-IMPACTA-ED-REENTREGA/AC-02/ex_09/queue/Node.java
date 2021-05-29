package queue;

public class Node<E> {

	private E element; // assumimos: os elementos são strings

	private Node next;

	// Cria um nodo com um dado elemento e o próximo nodo

	public Node() {
		this.element = null;
		this.next = null;
	}

	// Retorna o elemento deste nodo

	public E getElement() {
		return element;
	}

	// Retorna o próximo elemento deste nodo

	public Node getNext() {
		return next;
	}

	// Métodos modificadores:

	// Define o elemento deste nodo

	public void setElement(E elem) {
		element = elem;
	}

	// Define o próximo elemento deste nodo

	public void setNext(Node newNext) {
		next = newNext;
	}

}
