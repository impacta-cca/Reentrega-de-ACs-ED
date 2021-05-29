package ex07;

import pilha.ArrayStack;

public class main {

	public static void main(String[] args) {
		final ArrayStack<Integer> S = new ArrayStack<Integer>();
		// Cria pilha e aplica operacoes propostas.
		S.push(5);
		System.out.println(S.toString());
		S.push(3);
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.push(2);
		System.out.println(S.toString());
		S.push(8);
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.push(9);
		System.out.println(S.toString());
		S.push(1);
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.push(7);
		System.out.println(S.toString());
		S.push(6);
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.push(4);
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
		S.pop();
		System.out.println(S.toString());
	}
}
