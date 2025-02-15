package marcelino.lucas.maratonajava.introducao;

public class PrimitiveTypes {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long and boolean.
        int age = 18;
        long bigNumber = 100000L;
        double salaryDouble = 2000D;
        float salaryFloat =  (float) 2500.0D;
        byte ageByte = 30;
        short ageShort = 10;
        boolean truth  = true;
        boolean fake = false;
        char character = 10;

        // String is not a primitive type - It is a class.
        String phrase = "私は母が大好きです。\n";

        System.out.println("My age is " + age + " years old.");
        System.out.println(truth);
        System.out.println(salaryFloat);
        System.out.println(phrase);

    }
}
