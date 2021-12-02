package Aula03;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //Conta c = new Conta();
        //ArithmeticException exception = new ArithmeticException("deu errado"); //este seria o jeito de instanciar a exception e executar
        //throw exception; // - o throw é um jeito forçado de executar a exception, ele "joga a bomba" na pilha.
        //throw c; - dá errado, joga a "bomba" epenas sendo exceptions
        throw new ArithmeticException ("deu errado"); // este é o jeito mais comum de instanciar e executar uma exception
        //System.out.println("Fim do metodo2"); // aqui o código não compilará, pois chama a exception antes;        
    }
}
