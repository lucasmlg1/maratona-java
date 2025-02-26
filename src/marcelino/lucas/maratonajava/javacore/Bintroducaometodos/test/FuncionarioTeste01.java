package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luffy");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{1200, 987.32, 2000});
        funcionario.imprimir();
        System.out.println("media é "+ funcionario.getMedia());



    }
}
