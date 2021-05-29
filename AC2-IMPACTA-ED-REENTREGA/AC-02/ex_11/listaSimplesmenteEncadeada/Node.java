package listaSimplesmenteEncadeada;

//Nodo de uma lista simplesmente encadeada de strings

public class Node {

	private String element; // assumimos: os elementos s�o strings
	private Node next;

	// Cria um nodo com um dado elemento e o pr�ximo nodo

	public Node(String s, Node n) {
		element = s;
		next = n;
	}

	// Retorna o elemento deste nodo

	public String getElement() {
		return element;
	}

	// Retorna o pr�ximo elemento deste nodo

	public Node getNext() {
		return next;
	}

	// M�todos modificadores:

	// Define o elemento deste nodo

	public void setElement(String newElem) {
		element = newElem;
	}

	// Define o pr�ximo elemento deste nodo

	public void setNext(Node newNext) {
		next = newNext;
	}

}