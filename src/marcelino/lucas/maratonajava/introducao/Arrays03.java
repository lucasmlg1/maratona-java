package marcelino.lucas.maratonajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";

        for (int i=0; i<nomes.length;i++){
            System.out.println(nomes[i]);
        }

    }
}
