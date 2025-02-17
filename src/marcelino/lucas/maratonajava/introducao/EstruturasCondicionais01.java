package marcelino.lucas.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 19;
        boolean isAutorizadoComprarBebida = age >=18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebidas alcoólicas");
        } else{
            System.out.println("Compra não autorizada.");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }
    }
}
