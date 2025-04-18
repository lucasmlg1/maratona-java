package marcelino.lucas.maratonajava.javacore.Gassociacao.test;

import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Jogador;
import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Kaká");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----------- jogadores ----------");
        jogador.imprimirDados();
        System.out.println("------------ time -------------");
        time.imprimirDados();
    }
}
