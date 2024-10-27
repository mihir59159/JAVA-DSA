
//find the greatest divisor of two input number
import java.util.Scanner;

public class Greatest_Divisor {

    // brute force approce but this is not efficient because this TC = O(min(x,y))
    public static int GreatestDivisor(int num1, int num2, int min) {
        if (min == 1)
            return 1;
        if (num1 % min == 0 && num2 % min == 0)
            return min;
        return GreatestDivisor(num1, num2, min - 1);
    }

    // this is special type of method : Explain in PDF
    public static int GreatestDivisor2(int x, int y) {
        if (x % y == 0)
            return y;
        return GreatestDivisor2(y, x % y);
    }

    // same code as above but this is solve with iteration
    // public static int GreatestDivisor2(int x, int y) {
    // while (x % y != 0) {
    // int temp = x % y;
    // x = y;
    // y = temp;
    // }
    // return y;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 2 Number : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        // int min = Math.min(num1, num2);

        // System.out.print(GreatestDivisor(num1, num2, min));
        System.out.print(GreatestDivisor2(num1, num2));

        sc.close();
    }
}
