package Aula01;

public class Fluxo {

	/*
	 * Neste exemplo, podemos ver a introdu��o de Exceptions. Veja que na linha 30,
	 * o denominador da divis�o � 0. Logo, sabemos que este resultado n�o condiz com
	 * as regras matem�ticas. Repare tamb�m que o c�digo � compilado, n�o mostra
	 * erro na IDE, mas ao executar ele mostra a excess�o. Isso acontece porque o
	 * c�digo n�o interpreta que esta divis�o � errada, ele apenas avisa no console.
	 * Com isso, podemos tratar algumas excess�es, alter�-las ou at� mesmo
	 * melhor�-las.
	 */

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch (ArithmeticException ex) {
				System.out.println("Resolvido m�todo 2");
			}
			System.out.println("Fim do metodo2");
		}
	}

	/*
	 * J� neste segundo exemplo, podemos ver que o Try, Catch, usado para tratar as
	 * exce��es, pode ser usado em qualquer local do c�digo, desde que respeite a
	 * ordem e a sintaxe.
	 */

	public static void second(String[] args) {
		System.out.println("Ini do main");
		metodo3();
		System.out.println("Fim do main");
	}

	private static void metodo3() {
		System.out.println("Ini do metodo 3");
		try {
			metodo4();
		} catch (ArithmeticException ex) {
			System.out.println("Resolvido m�todo 4");
		}
		System.out.println("Fim do metodo 3");
	}

	private static void metodo4() {
		System.out.println("Ini do metodo4");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			System.out.println("Fim do metodo 4");
		}
	}
}
