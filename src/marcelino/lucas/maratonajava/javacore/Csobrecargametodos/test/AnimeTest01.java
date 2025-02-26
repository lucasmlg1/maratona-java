package marcelino.lucas.maratonajava.javacore.Csobrecargametodos.test;

import marcelino.lucas.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("You lie in April", "anime", 24, "Romance");
        anime.imprimir();
    }
}
