import java.util.Scanner;
// import java.lang.Math;

public class Number_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Decimal to Binary */
        System.out.print("Enter The Decimal Number : ");
        int num = sc.nextInt();

        int Binary = 0;
        int pw = 1;

        while (num > 0) {
            Binary += (num % 2) * pw;
            num /= 2;
            pw *= 10;
        }

        System.out.print("Binary is :" + Binary);

        // ********************************************************************************

        /* Binary to Decimal */
        // System.out.print("Enter The Bainry Number : ");
        // int num = sc.nextInt();

        // int Decimal = 0;
        // int i = 0;

        // while (num > 0) {
        // int bit = num % 10;
        // Decimal = Decimal + bit * (int) Math.pow(2, i);
        // num /= 10;
        // i++;
        // }

        // System.out.print("Dicimal Num is : " + Decimal);

        // ********************************************************************************

        /* Binary to Decimal */
        // System.out.print("Enter The Bainry Number : ");
        // int num = sc.nextInt();

        // int Decimal = 0;
        // int pw = 1;

        // while (num > 0) {
        // int bit = num % 10;
        // Decimal += bit * pw;
        // num /= 10;
        // pw *= 2;
        // }

        // System.out.print("Dicimal Num is : " + Decimal);

        // ********************************************************************************

        sc.close();
    }
}
