package marcelino.lucas.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0;i<episodios.length;i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this();
        this.nome = nome;
        System.out.println(this.nome);
    }

    public Anime(){
        for (int numeros: episodios){
            System.out.print(numeros + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

}

