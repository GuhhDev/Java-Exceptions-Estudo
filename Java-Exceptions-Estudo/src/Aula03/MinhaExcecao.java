package Aula03;

/* Aqui criamos nossa primeira Exce��o!
 * N�s podemos ver que ela extende de runtimeException, trazendo todos os outros
 * m�todos que � usado na maioria das exce��es. Ela ir� funcionar exatamente como as outras
 */

public class MinhaExcecao extends RuntimeException{

    public MinhaExcecao(String msg){ //construtor com String msg pra passar a mensagem
        super(msg); // aqui chama o super para n�o perder a mensagem
    }
}