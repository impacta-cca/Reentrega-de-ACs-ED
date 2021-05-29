package metodo_ex4b;

import arranjo.ArrayIndexList;
import source.NodeStack;

public class B04 {
	public static Object invertearranjo(ArrayIndexList<Integer> arranjo) {
		final NodeStack<Integer> pilha = new NodeStack<Integer>();
		for (int i = 0; i < arranjo.size(); i++) {
			pilha.push(arranjo.get(i));
		}
		for (int i = 0; i < arranjo.size(); i++) {
			arranjo.set(i, pilha.pop());
		}
		return arranjo;
	}

}
