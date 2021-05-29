package testesex4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import metodo_ex4b.B04c;

class Ex_04_c {
	// Cria pilha para acumular caracteres e remover conforme encontrar seu
	// fechamento
	B04c metodo = new B04c();

	@Test
	void test() {
		assertEquals(true, metodo.verificaABerto("()(( )){([( )])}"));
		assertEquals(true, metodo.verificaABerto("((( )(( )){([( )])}))"));
		assertEquals(false, metodo.verificaABerto(")(( )){([( )])}"));
		assertEquals(false, metodo.verificaABerto("({[])}"));
		assertEquals(false, metodo.verificaABerto("("));
		assertEquals(false, metodo.verificaABerto(""));
		assertEquals(false, metodo.verificaABerto("((((({{{{"));
		assertEquals(false, metodo.verificaABerto("}}}]]"));
		assertEquals(false, metodo.verificaABerto("}}}]][[{{{"));
	}
}
