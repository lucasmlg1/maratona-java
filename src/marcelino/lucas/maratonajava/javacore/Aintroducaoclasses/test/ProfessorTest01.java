package marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.test;

import marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 17;
        professor.sexo = 'M';
        professor.nome = "Mestre Kami";

        System.out.println(professor.idade + " " + professor.sexo + " " + professor.nome);
    }
}
