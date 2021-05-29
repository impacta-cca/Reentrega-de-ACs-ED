package mapaOrdenadoAVL.Classes;

import java.util.Iterator;

import mapaOrdenado.Classes.*;
import mapaOrdenado.exception.*;
import mapaOrdenado.Interfaces.*;
public class ElementIterator13<E> implements Iterator<E> {

	protected PositionList<E> list;

	protected Position<E> cursor;

	// Cria um elemento iterator

	public ElementIterator13(PositionList<E> L) {

		list = L;

		cursor = (list.isEmpty()) ? null : list.first();

	}

	// Retorna se o iterator tem ou n�o um pr�ximo objeto.

	public boolean hasNext() {
		return (cursor != null);
	}

	// Retorna o pr�ximo objeto do iterator.

	public E next() throws NoSuchElementException {

		if (cursor == null)
			throw new NoSuchElementException("No next element");

		E toReturn = cursor.element();

		cursor = (cursor == list.last()) ? null : list.next(cursor);

		return toReturn;

	}

	// Dispara um {@link UnsupportedOperationException} para todos os casos, porque

	// a remo��o n�o � uma opera��o suportada por este iterator.

	public void remove() throws UnsupportedOperationException {

		throw new UnsupportedOperationException("remove");

	}

}
