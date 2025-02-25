package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 15;
        pessoa.nome = "Ichigo";
        pessoa.imprime();
    }
}
