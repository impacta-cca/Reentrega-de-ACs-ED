package ex05;

public class Ex_05_06 {
	public static void main(String args[]) {
		testaPilha();
	}

	public static void testaPilha() {
		// Cria lista vazia S
		final NodeStack<Integer> S = new NodeStack<Integer>();

		// Cria 3 casos de erro
		for (int i = 1; i <= 3; i++) {
			S.push(i);
			// Captura os erros e ignora.
			try {
				S.pop();
			} catch (Exception EmptystackException) {
				System.out.println("Nao foi possivel realizar o pop, pois a lista esta vazia");
			}
			try {
				S.top();
			} catch (Exception EmptystackException) {
				System.out.println("Nao foi possivel realizar o top, pois a lista esta vazia");
			}
		}

		// 25 operações push (-3 dos casos para gerar erro e tratar)
		for (int i = 1; i <= 22; i++) {
			S.push(i);
		}
		// Mosta Pilha aṕos 22 push
		System.out.println("Pilha aṕos 22 operacoes de push");
		System.out.println(S.toString());
		System.out.println();

		// 12(-3 dos casos para gerar erro e tratar) operações top
		for (int i = 0; i < 9; i++) {
			S.top();
		}

		// 10 operações pop (-3 dos casos para gerar erro e tratar)
		for (int i = 0; i < 7; i++) {
			S.pop();
		}
		// Mosta Pilha aṕos 10 pop
		System.out.println("Pilha aṕos 7 operações de pop");
		System.out.println(S.toString());
		System.out.println();

		// Exibe tamanho da Pilha
		int tamanho = S.size();
		System.out.println("O tamanho da lista é: " + tamanho);
		System.out.println();

		// Exibe o valor corrente de top
		int top = S.top();
		System.out.print("O valor de corrente de top é: " + top);
	}
}