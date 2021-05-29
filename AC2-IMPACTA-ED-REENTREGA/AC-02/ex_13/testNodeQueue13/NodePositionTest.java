package testNodeQueue13;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import nodeQueue13.InvalidPositionException;
import nodeQueue13.NodePositionList;
import nodeQueue13.Position;

class NodePositionTest {
	//Teste do Exercicio 13
	@Test
	void test() {

		// Cria��o de duas listas diferentes para compara��o
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		NodePositionList<Integer> l1 = new NodePositionList<Integer>();

		// add os numeros 1, 2 e 3 na lista l
		l.addFirst(1);
		Position<Integer> p1 = l.first();
		l.addAfter(p1, 2);
		Position<Integer> p2 = l.next(p1);
		l.addAfter(p2, 3);

		// add os numeros 5, 2 e 8 na lista l1
		System.out.println(l.toString());
		l1.addFirst(5);
		Position<Integer> p3 = l1.first();
		l1.addAfter(p3, 2);
		Position<Integer> p4 = l1.next(p3);
		l1.addAfter(p4, 8);
		System.out.println(l1.toString());
		System.out.println(l.checkpositionlist(p4));
		
		l1.addAfter(p4, 666);
		System.out.println(l1.toString());
		
		
		// verifica se a posi��o p4 (que pertence a l1) faz parte a lista l e � esperado
		// o
		// o retorno do erro InvalidPositionException
		assertThrows(InvalidPositionException.class, () -> {
			l.addAfter(p4, 11);
		});

	}

}
