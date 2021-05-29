package metodo_ex4b;

import source.NodeStack;

public class B04c {

	public boolean verificaABerto(String f) {
		final NodeStack<Character> pilha = new NodeStack<Character>();

		if (f.isEmpty())
			return false;
		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == '[') {
				pilha.push('[');
			} else if (f.charAt(i) == '{') {
				pilha.push('{');
			} else if (f.charAt(i) == '(') {
				pilha.push('(');
			}

			// Verifica se o caracter � igual a ']','}' ou ')'

			else if (f.charAt(i) == ']') {
				if (pilha.isEmpty() || pilha.pop() != '[')
					return false;

			}

			else if (f.charAt(i) == '}') {
				if (pilha.isEmpty() || pilha.pop() != '{')
					return false;

			}

			else if (f.charAt(i) == ')') {
				if (pilha.isEmpty() || pilha.pop() != '(')
					return false;

			}
		}
		if (pilha.isEmpty())
			return true;
		else {
			return false;
		}

	}

}
