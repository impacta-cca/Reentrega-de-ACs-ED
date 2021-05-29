package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listaSimplesmenteEncadeada.EmptyListException;
import listaSimplesmenteEncadeada.SLinkedList;

class InverteNodosTest {

	SLinkedList lista = new SLinkedList();

	@Test
	void test() {

		assertThrows(EmptyListException.class, () -> {
			lista.inverter();
		});

		assertThrows(EmptyListException.class, () -> {
			lista.toString();
		});

		lista.addNodo("um");
		lista.addNodo("dois");
		lista.addNodo("tr�s");
		lista.addNodo("quatro");

		assertEquals("[um, dois, tr�s, quatro]", lista.toString(), "Deve resultar [um, dois, tr�s, quatro]");

		lista.inverter();

		assertEquals("[quatro, tr�s, dois, um]", lista.toString(), "Deve resultar [quatro, tr�s, dois, um]");

	}

}
