package marcelino.lucas.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 45;
        int number2 = 20;
        double resultado = (double) number1/number2;
        System.out.println(resultado);

        // %
        int remainder = 21%7;
        System.out.println(remainder);
        //

        // < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenDifferentOfTwenty = 10 != 20;

        System.out.println(isTenSmallerThanTwenty);
        System.out.println(isTenBiggerThanTwenty);
        System.out.println(isTenEqualToTwenty);
        System.out.println(isTenDifferentOfTwenty);

        // && (AND) || (OR) !
        int age = 35;
        float salary = 3500f;
        boolean isWithinTheLawBiggerThanThirty = age >= 30 && salary >= 4612;
        boolean isWithinTheLawSmallerThanThirty = age < 30 && salary >= 3381;


        System.out.println(isWithinTheLawBiggerThanThirty);
        System.out.println(isWithinTheLawSmallerThanThirty);


        double totalAmountAccount1 = 200;
        double totalAmountAccount2 = 10000;
        float playstationValue = 5000;
        boolean isPlaystationBuyable = totalAmountAccount1> playstationValue || totalAmountAccount2>playstationValue;
        System.out.println(isPlaystationBuyable);

        // += -= /= %=
        double bonus = 1800;
        bonus += 1000; // more flexibility of the code, it is better than using "bonus = 1800 + 1000" for an example.
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int count = 0;
        count += 1; // count = count + 1
        count ++;
        count --;
        // count++ != ++count BTW;
        System.out.println(count);
    }
}
