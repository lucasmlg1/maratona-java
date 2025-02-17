package marcelino.lucas.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se o salário > 5000;
        double salary = 6000;
        String mensagemDoar = "Eu vou doar 500tao pro devdojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condição) ? verdadeiro : falso
        String resultado = salary>5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
