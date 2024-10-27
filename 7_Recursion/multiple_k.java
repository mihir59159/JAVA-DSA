
//print any number of first k multiple
import java.util.Scanner;

public class multiple_k {

    public static void MultipleOfNum(int num, int k) {
        if (k == 0)
            return;
        MultipleOfNum(num, k - 1);
        System.out.print(num * k + " ");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num and that K multiple : ");
        int num = sc.nextInt(), k = sc.nextInt();

        // System.out.print((p, q));
        MultipleOfNum(num, k);

        sc.close();
    }
}
