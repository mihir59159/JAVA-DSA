//find floor value of square root

import java.util.Scanner;

public class Problem_2_BS {

    static int FindSquareRoot(int num) {
        int st = 0, end = num;
        int sqr = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val == num) {
                return mid;
            } else if (num < val) {
                end = mid - 1;
            } else {
                sqr = mid;
                st = mid + 1;
            }
        }
        return sqr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int ans = FindSquareRoot(num);
        System.out.print("Square root of " + num + " is " + ans);
        sc.close();
    }
}
