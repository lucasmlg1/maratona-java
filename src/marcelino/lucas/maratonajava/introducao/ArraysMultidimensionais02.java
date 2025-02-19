package marcelino.lucas.maratonajava.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array2 = {1,2,3,4,5,6};


        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3,4};
        arrayInt[2] = array2;

        int [][] arrayTeste = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] arrayBase:arrayTeste){
            System.out.println("\n");
            for (int num:arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
