package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        boolean result = calculadora.numeroPrimo(13);
        System.out.println(result);
    }
}
