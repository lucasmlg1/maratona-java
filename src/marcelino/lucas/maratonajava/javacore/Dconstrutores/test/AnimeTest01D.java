package marcelino.lucas.maratonajava.javacore.Dconstrutores.test;

import marcelino.lucas.maratonajava.javacore.Dconstrutores.dominio.AnimeD;

public class AnimeTest01D {
    public static void main(String[] args) {
        AnimeD anime = new AnimeD("Naruto", "Anime", 500, "Ação", "MAPA");
//        anime.init("You lie in April", "anime", 24, "Romance");
        anime.imprimir();
    }
}
