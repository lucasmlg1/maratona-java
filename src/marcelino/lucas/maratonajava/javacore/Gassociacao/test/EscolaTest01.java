package marcelino.lucas.maratonajava.javacore.Gassociacao.test;

import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Escola;
import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Raícia");
        Professor professor2 = new Professor("Yoost");
        Professor[] professor = {professor1, professor2};
        Escola escola = new Escola("Maria do Socorro", professor);

        escola.imprimir();

    }
}
