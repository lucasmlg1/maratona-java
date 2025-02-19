package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.test;

import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraestudante = new ImpressoraEstudante();

        estudante01.idade = 15;
        estudante01.nome = "Midoriya";
        estudante01.sexo = 'M';

        estudante02.idade = 16;
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';

        impressoraestudante.imprime(estudante01);
        impressoraestudante.imprime(estudante02);


    }
}
