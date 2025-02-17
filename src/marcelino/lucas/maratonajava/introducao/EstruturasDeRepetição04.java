package marcelino.lucas.maratonajava.introducao;

public class EstruturasDeRepetição04 {
    public static void main(String[] args) {
        // DADO O VALOR DE UM CARRO, DESCUBRA EM QUANTAS VEZES ELE PODE SER PARCELADO.
        // CONDIÇÃO valorParcela >= 1000;
        double valorTotal = 30000;


        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;


            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
            } else {
                break;
            }


            System.out.println("Fora do if, mas dentro do for: " + parcela);
        }
    }
}