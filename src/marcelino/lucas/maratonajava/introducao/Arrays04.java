package marcelino.lucas.maratonajava.introducao;

public class Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4};
        int[] numeros3 = new int[]{1,2,3,4,5};

//        for (int i=0;i<numeros2.length;i++){
//            System.out.println(numeros2[i]);
//        }

        for (int j=0;j<numeros3.length;j++){
            System.out.print(numeros3[j] + " ");
        }

//        for(int num:numeros3){
//            System.out.println(num);
//        }
    }
}
