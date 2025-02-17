package marcelino.lucas.maratonajava.introducao;

public class EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores 1 e 7, imprima se é dia útil ou fim de semana.
        // Considere 1 como domingo.
        byte day = 4;
        switch (day){
            case 1:
            case 7:
                System.out.println("Fim de semana."); break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil."); break;
            default:
                System.out.println("Opção inválida"); break;
        }
    }
}
