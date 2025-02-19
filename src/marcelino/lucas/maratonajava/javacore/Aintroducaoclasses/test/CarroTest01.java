package marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.test;

import marcelino.lucas.maratonajava.javacore.Aintroducaoclasses.dominio.Carro01;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro01 carro01 = new Carro01();
        Carro01 carro02 = new Carro01();
            carro01.nome = "Civic";
            carro01.modelo = "Type-R";
            carro01.ano = 2024;

            carro02.nome = "Corolla";
            carro02.modelo = "GLi";
            carro02.ano = 2024;

        System.out.println(carro01.nome + " " + carro01.modelo + " "+ carro01.ano);
        System.out.println(carro02.nome + " " + carro02.modelo + " "+ carro02.ano);

    }
}
