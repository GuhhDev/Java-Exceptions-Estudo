package Aula01;

public class Fluxo {

	/*
	 * Neste exemplo, podemos ver a introdução de Exceptions. Veja que na linha 30,
	 * o denominador da divisão é 0. Logo, sabemos que este resultado não condiz com
	 * as regras matemáticas. Repare também que o código é compilado, não mostra
	 * erro na IDE, mas ao executar ele mostra a excessão. Isso acontece porque o
	 * código não interpreta que esta divisão é errada, ele apenas avisa no console.
	 * Com isso, podemos tratar algumas excessões, alterá-las ou até mesmo
	 * melhorá-las.
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
				System.out.println("Resolvido método 2");
			}
			System.out.println("Fim do metodo2");
		}
	}

	/*
	 * Já neste segundo exemplo, podemos ver que o Try, Catch, usado para tratar as
	 * exceções, pode ser usado em qualquer local do código, desde que respeite a
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
			System.out.println("Resolvido método 4");
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
