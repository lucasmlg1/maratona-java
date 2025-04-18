package marcelino.lucas.maratonajava.javacore.Gassociacao.test;

import marcelino.lucas.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args){

        Jogador jogador1 = new Jogador("Lucas");
        Jogador jogador2 = new Jogador("Marcelino");
        Jogador jogador3 = new Jogador("Gomes");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

       for (Jogador jogador : jogadores){
           jogador.imprimirDados();
       }
    }
}
