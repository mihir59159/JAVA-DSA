/*import java.util.Scanner;

public class Besic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int num = sc.nextInt();
        int modulo = num - (2 * (num / 2)); // r = a - (b * q) if a = 5, b =3, r=modulo
        // and q=a/2 so 5%3 == 5-(3*(5/3))
        // int modulo = num%2;
        if (modulo == 0) {
            System.out.print(num + " is Even");
        } else {
            System.out.print(num + " is Odd");
        }
        sc.close();
    }
} */

// public class Besic{
// public static void main(String[] args){
// int a = 3;
// double b = 3.0;
// if(a == b) System.out.println(a+" "+b);
// else System.out.println("false");
// }
// }

// public class Besic {
// public static void main(String[] args){
// int a = 3,b;
// b = a = 10;
// boolean c = a < 10;

// System.out.println(c);
// }
// }

import java.util.Scanner;

public class Besic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num : ");
        int Number = sc.nextInt();// 75486
        int Rev = 0;

        while (Number > 0) {
            Rev = Rev * 10 + (Number % 10);
            Number /= 10;
        }

        System.out.println("The Reverse Num is : " + Rev);

        sc.close();
    }
}