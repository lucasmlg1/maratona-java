package marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.test;


import marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante01 estudante01 = new Estudante01();
        estudante01.idade = 18;
        estudante01.nome = "Lucas";
        estudante01.sexo = 'M';

        System.out.println(estudante01.idade);
        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
    }
}
