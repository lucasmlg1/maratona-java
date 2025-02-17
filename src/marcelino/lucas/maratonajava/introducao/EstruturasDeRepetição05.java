package marcelino.lucas.maratonajava.introducao;

public class EstruturasDeRepetição05 {
    public static void main(String[] args) {
        // DADO O VALOR DE UM CARRO, DESCUBRA EM QUANTAS VEZES ELE PODE SER PARCELADO.
        // CONDIÇÃO valorParcela >= 1000;
        double valorTotal = 30000;


        for (int parcela = (int) valorTotal; parcela >=1 ; parcela--) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela<1000){
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}