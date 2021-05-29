package nodeQueue13;

import java.util.Iterator;

public class NodePositionList<E> implements PositionList<E> {

	protected int numElts; // Nï¿½mero de elementos na lista

	protected Node<E> header, trailer; // Sentinelas especiais

	// Construtor que cria uma lista vazia

	public NodePositionList() {

		numElts = 0;

		header = new Node<E>(null, null, null); // cria a cabeï¿½a

		trailer = new Node<E>(header, null, null); // cria a cauda

		header.setNext(trailer); // faz a cabeï¿½a e a cauda apontarem uma para a outra

	}

	// Verifica se a posiï¿½ï¿½o ï¿½ vï¿½lida para esta lista e a converte para DNode se for
	// vï¿½lida

	protected Node<E> checkPosition(Position<E> p) throws InvalidPositionException {

		if (p == null)
			throw new InvalidPositionException("Null position passed to NodeList");

		if (p == header)
			throw new InvalidPositionException("The header node is not a valid position");

		if (p == trailer)
			throw new InvalidPositionException("The trailer node is not a valid position");

		try {

			Node<E> temp = (Node<E>) p;

			if ((temp.getPrev() == null) || (temp.getNext() == null))

				throw new InvalidPositionException("Position does not belong to a valid NodeList");

			return temp;

		} catch (ClassCastException e) {

			throw new InvalidPositionException("Position is of wrong type for this list");

		}

	}

	// Retorna a quantidade de elementos na lista

	public int size() {
		return numElts;
	}

	// Retorna quando a lista esta vazia

	public boolean isEmpty() {
		return (numElts == 0);
	}

	// Retorna a primeira posiï¿½ï¿½o da lista

	public Position<E> first() throws EmptyListException {

		if (isEmpty())
			throw new EmptyListException("List is empty");

		return header.getNext();

	}

	// Retorna a posiï¿½ï¿½o que antecede a fornecida

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException {

		Node<E> v = checkPosition(p);

		Node<E> prev = v.getPrev();

		if (prev == header)
			throw new BoundaryViolationException("Cannot advance past the beginning of the list");

		return prev;

	}

	// Insere o elemento antes da posiï¿½ï¿½o fornecida, retornando a nova posiï¿½ï¿½o

	public void addBefore(Position<E> p, E element) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		numElts++;

		Node<E> newNode = new Node<E>(v.getPrev(), v, element);
		newNode.setHashlistaoriginal(this.hashCode());

		v.getPrev().setNext(newNode);

		v.setPrev(newNode);

	}

	// Insere o elemento dado no inï¿½cio da lista, retornando a nova posiï¿½ï¿½o

	public void addFirst(E element) {

		numElts++;

		Node<E> newNode = new Node<E>(header, header.getNext(), element);
		newNode.setHashlistaoriginal(this.hashCode());

		header.getNext().setPrev(newNode);

		header.setNext(newNode);

	}

	// Remove da lista a posiï¿½ï¿½o fornecida

	public E remove(Position<E> p) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		numElts--;

		Node<E> vPrev = v.getPrev();

		Node<E> vNext = v.getNext();

		vPrev.setNext(vNext);

		vNext.setPrev(vPrev);

		E vElem = v.element();

		// Desconecta a posiï¿½ï¿½o da lista e marca-a como invï¿½lida

		v.setNext(null);

		v.setPrev(null);

		return vElem;

	}

	// Substitui o elemento da posiï¿½ï¿½o fornecida por um novo e retorna o elemento
	// velho

	public E set(Position<E> p, E element) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		E oldElt = v.element();

		v.setElement(element);

		return oldElt;

	}

	// Retorna o ï¿½ltimo nodo da lista.

	public Position<E> last() {

		if (isEmpty())
			throw new EmptyListException("List is empty");

		return trailer.getPrev();

	}

	// Retorna o nodo que segue um dado nodo da lista.

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {

		Node<E> v = checkPosition(p);

		Node<E> next = v.getNext();

		if (next == trailer)
			throw new BoundaryViolationException("Cannot advance past the finaling of the list");

		return next;

	}

	// Insere um elemento na ï¿½ltima posiï¿½ï¿½o, retornando uma posiï¿½ï¿½o nova.

	public void addLast(E e) {

		numElts++;

		Node<E> newNode = new Node<E>(trailer.getPrev(), trailer, e);
		newNode.setHashlistaoriginal(this.hashCode());

		trailer.getPrev().setNext(newNode);

		trailer.setPrev(newNode);

	}

	// Insere um elemento apï¿½s um dado elemento da lista.

	public void addAfter(Position<E> p, E e) throws InvalidPositionException {

		if (checkpositionlist(p) == false) {
			throw new InvalidPositionException("Nodo nï¿½o pertence a lista");
		}

		Node<E> v = checkPosition(p);

		numElts++;
		
		Node<E> newNode = new Node<E>(v, v.getNext(), e);
		newNode.setHashlistaoriginal(this.hashCode());

		v.getNext().setPrev(newNode);

		v.setNext(newNode);

	}

	public void MakeFirst(Position<E> mudar) {
		Node p = header.getNext();
		Node temp = this.checkPosition(mudar);

		Node mprev = temp.getPrev();
		Node mnext = temp.getNext();
		mprev.setNext(mnext);
		mnext.setPrev(mprev);

		temp.setNext(header.getNext());
		temp.setPrev(header);
		header.setNext(temp);

	}
	
	//add no Nodo um atributo do tipo inteiro HashCodeOriginal e compara se o hashcodeoriginal do nodo é igual ao da lista que chamou
	// e retornará false caso não seja igual e verdadeiro caso seja igual.

	public boolean checkpositionlist(Position<E> p) {
		Node<E> recebido = checkPosition(p);
		

		if (recebido.getHashlistaoriginal() == this.hashCode()) {
				return true;
			}
		return false;
	}

	// Retorna a representaï¿½ï¿½o textual de uma lista de nodos

	public static <E> String toString(PositionList<E> l) {
		String s = "";
		for (E i : l) {
			s += ", " + i;
		}
		s = (s.length() == 0 ? s : s.substring(2));
		return "[" + s + "]";
	}
	
	// Retorna o iterator a partir do ElemenIterator.
	public Iterator<E> iterator() {
		return new ElementIterator13<E>(this);
	}

	public String toString() {
		return toString(this);
	}
}
