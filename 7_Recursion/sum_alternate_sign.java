//sum of n number with alternate sign 1-2+3-4+5...

import java.util.Scanner;

public class sum_alternate_sign {

    static int PrintAlternateSign(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return PrintAlternateSign(n - 1) - n;
        }
        return PrintAlternateSign(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num Do you Want Sum Of alternate Sign : ");
        int num = sc.nextInt();

        // System.out.print((p, q));
        int sum = PrintAlternateSign(num);
        System.out.println("The Sum if First " + num + "With Alternate Sign : " + sum);

        sc.close();
    }
}
