package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import queue.ArrayQueue;
import queue.EmptyQueueException;
import queue.FullQueueException;

class QueueTests {

	ArrayQueue<String> Q = new ArrayQueue<String>(4);

	@Test
	void test() {
		
		assertEquals(true, Q.isEmpty(), "Deve imprimir true");

		assertEquals(0, Q.size(), "Deve imprimir 0");

		Q.enqueue("Angelica");

		assertEquals("[Angelica]", Q.toString(), "Deve imprimir [Angelica]");

		Q.enqueue("Eliza");

		assertEquals("[Angelica, Eliza]", Q.toString(), "Deve imprimir [Angelica, Eliza]");

		Q.enqueue("Peggy");

		assertEquals("[Angelica, Eliza, Peggy]", Q.toString(), "Deve imprimir [Angelica, Eliza, Peggy]");

		Assertions.assertThrows(FullQueueException.class, () -> { Q.enqueue("Alexander"); });
		
		assertEquals(3, Q.size(), "Deve imprimir 3");
		
		assertEquals("Angelica", Q.dequeue(), "Deve ter eliminado o primeiro da fila, Angelica");

		assertEquals("Eliza", Q.front(), "Deve imprimir Eliza");
		
		assertEquals(false, Q.isEmpty(), "Deve imprimir false");
		
		assertEquals("Eliza", Q.dequeue(), "Deve ter eliminado o primeiro da fila, Eliza");
		
		assertEquals("Peggy", Q.dequeue(), "Deve ter eliminado o primeiro da fila, Peggy");
		
		Assertions.assertThrows(EmptyQueueException.class, () -> { Q.dequeue(); });
		
		assertEquals("[]", Q.toString(), "Deve imprimir []");
		
	}

}
