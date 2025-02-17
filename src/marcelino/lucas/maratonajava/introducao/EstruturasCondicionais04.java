package marcelino.lucas.maratonajava.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        // I want to know how much I have to pay in Netherlands 2020 base on my annual salary
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double tercaFaixa = 49.50/100;
        double valorImposto;


        if (salarioAnual<=34712){
            valorImposto = primeiraFaixa *salarioAnual;
        } else if (salarioAnual>= 34712 && salarioAnual<=68507){
            valorImposto = salarioAnual*segundaFaixa;
        } else{
            valorImposto = salarioAnual*tercaFaixa;
        }
        System.out.println(valorImposto);

    }
}
