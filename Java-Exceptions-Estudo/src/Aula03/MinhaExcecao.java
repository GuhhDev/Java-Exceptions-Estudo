package Aula03;

/* Aqui criamos nossa primeira Exceção!
 * Nós podemos ver que ela extende de runtimeException, trazendo todos os outros
 * métodos que é usado na maioria das exceções. Ela irá funcionar exatamente como as outras
 */

public class MinhaExcecao extends RuntimeException{

    public MinhaExcecao(String msg){ //construtor com String msg pra passar a mensagem
        super(msg); // aqui chama o super para não perder a mensagem
    }
}