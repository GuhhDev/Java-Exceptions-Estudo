package Aula02;

public class Fluxo2 {

	/* Nesta segunda aula, vamos tratar mais a fundo nossas Exceptions. Vejamos que foi criado uma segunda classe
	 * neste exemplo, irei dizer o porqu�. Vamos usar esta segunda classe apenas para criar um m�todo simples e
	 * instanciar na classe Fluxo2, para fins did�ticos. Irei mostrar tamb�m o uso de "Multi Catch" e uma Exce��o 
	 * bem usada no mundo do java, chamada NullPointerException
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
		metodo3();
		} catch (ArithmeticException | NullPointerException ex){
			String msg1 = ex.getMessage(); 
			System.out.println("Exception com arithmetic e nullpointer" + msg1);
		}
		System.out.println("Fim do main");
	}

	/* Criado nosso m�todo3, iremos tratar alguns erros. Aqui no m�todo3, irei apontar um detalhe.
	 * repare que ArithmeticException, por exemplo, � uma classe referenciando o "ex", sendo assim podendo usar
	 * o "ex" e "." na frente para chamar alguns m�todos gen�ricos das exceptions, seja ela ArithmeticException ou
	 * qualquer outra. vejamos:
	 */
	
	private static void metodo3() {
		System.out.println("Ini do metodo 3");
		try {
			metodo4();
		} catch (ArithmeticException ex) {
			String msg2 = ex.getMessage(); // Aqui apresento o getMessage, bem usado no dia a dia.
			System.out.println("Exception" + msg2);
			ex.printStackTrace(); // aqui apresento o printStackTrace, ele printa por onde deu a exception e seu caminho.
		}
		System.out.println("Fim do metodo 3");
	}
	
	private static void metodo4() {
		System.out.println("Ini do metodo4");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			Conta c = null;   // Instanciado a classe Conta
			c.deposita();	 // Chamando m�todo deposita, apenas para fins did�ticos
			System.out.println("Fim do metodo 4");
		}
	}
}
