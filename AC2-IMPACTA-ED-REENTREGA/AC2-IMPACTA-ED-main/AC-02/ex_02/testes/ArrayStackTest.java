package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pilha.ArrayStack;
import pilha.EmptyStackException;
import pilha.FullStackException;

class ArrayStackTest {

	static final ArrayStack<String> a = new ArrayStack<String>(3);

	@Test

	void pilhaInteiros() {

		a.push("sete");

		assertEquals("[sete]", a.toString(), "Deve imprimir [sete]");

		a.push("nove");

		assertEquals("[sete, nove]", a.toString(), "Deve imprimir [sete, nove]");

		a.push("um");

		assertEquals("[sete, nove, um]", a.toString(), "Deve imprimir [sete, nove, um]");

		Assertions.assertThrows(FullStackException.class, () -> {
			a.push("dois");
		});

		assertEquals("um", a.pop(), "Deve ter desempilhado um");

		assertEquals("[sete, nove]", a.toString(), "Deve imprimir [sete, nove]");

		assertEquals("nove", a.pop(), "Deve ter desempilhado nove");

		assertEquals("[sete]", a.toString(), "Deve imprimir [sete]");

		assertEquals("sete", a.pop(), "Deve ter desempilhado sete");

		assertEquals("[]", a.toString(), "Deve imprimir []");

		assertTrue(a.isEmpty());

		Assertions.assertThrows(EmptyStackException.class, () -> {
			a.pop();
		});

	}

}