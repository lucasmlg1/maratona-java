package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void diferençaDoisNumeros(){
        System.out.println(21-20);
    }
    public void multiplicaDoisNumeros(int num, float num2){
        System.out.println(num*num2);
    }
    public double divideDoisNumeros01(double num1, double num2){
        if (num2==0){
            return 0;
        }
        return num1/num2;
    }
    public double divideDoisNumeros02(double num1, double num2){
        if (num2!=0){
            return num1/num2;
        }
        return 0;
    }
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2==0){
            System.out.println("nao eh possivel realizar. ");
        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
    // DESAFIO: CRIAR UMA CALCULADORA QUE VALIDA SE O NUMERO É PRIMO OU NÃO. RETORNAR TRUE, SE FOR PRIMO,
    // RETORNAR FALSE, SE NÃO FOR.

    //DESAFIO 2: CRIAR UMA CALCULADORA QUE RECEBE UMA LISTA/ARRAY,
    // RETORNA A LISTA X2.

    public boolean numeroPrimo(int num){
        int contador=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador==2){
            return true;
        } else{
            return false;
        }
    }

}
