import java.util.Scanner;
// import java.lang.Math;

public class Armstrong_Num {
    public static int pow(int num, int pow) {
        if(pow == 0) return 1;
        return pow(num,pow-1)*num;
    }

    public static int ArmstrongCal(int num, int size) {
        if (num < 10)
            return pow(num,size);
            // return (int) Math.pow(num, size);
        return ArmstrongCal(num / 10, size) + pow(num % 10, size);
        // return ArmstrongCal(num / 10, size) + (int) Math.pow(num % 10, size);
    }

    public static int numDigitCal(int num) {
        int size = Integer.toString(num).length();
        return ArmstrongCal(num, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 2 Number : ");
        int num1 = sc.nextInt();
        System.out.print(num1 == numDigitCal(num1));

        sc.close();
    }
}
