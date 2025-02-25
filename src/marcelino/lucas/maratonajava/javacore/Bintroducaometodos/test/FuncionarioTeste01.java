package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Liminha";
        funcionario.idade = 22;

        funcionario.imprimir();



    }
}
