package marcelino.lucas.maratonajava.javacore.Gassociacao.test;

import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Jogador;
import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lucas");
        Jogador jogador2 = new Jogador("Lucas1");
        Time time = new Time("Blue Lock");


        jogador1.setTime(time);
        jogador1.imprimirDados();
        jogador2.imprimirDados();

    }
}
