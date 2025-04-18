package marcelino.lucas.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8};
    {
        System.out.println("Dentro do bloco de inicializacao");
    }

    public Anime(String nome){
        this();
        this.nome = nome;
        System.out.println(this.nome);
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0;i<episodios.length;i++){
                episodios[i] = i+1;
        }
        for (int numeros: episodios){
            System.out.print(numeros + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

}

