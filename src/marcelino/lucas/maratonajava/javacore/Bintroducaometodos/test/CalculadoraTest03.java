package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros01(30,30));
        System.out.println(calculadora.divideDoisNumeros02(30,30));
        calculadora.imprimeDivisaoDoisNumeros(234,0);
    }
}
