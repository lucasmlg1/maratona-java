package marcelino.lucas.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 15;
        String categoria;
        if (age<15){
            categoria = "Categoria infantil";
        } else if (age >= 15 && age<18){
            categoria = "Categoria Juvenil";
        } else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
