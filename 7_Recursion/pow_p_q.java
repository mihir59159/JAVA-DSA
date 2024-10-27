//print pow(p,q)
import java.util.Scanner;

public class pow_p_q {
    //TC = O(q)
    public static int FindPow(int p, int q) {
        if (q == 0)
            return 1;
        return FindPow(p, --q) * p;
    }

    //TC = O(logq)
    public static int FindPowAlt(int p, int q) {
        if (q == 0)
            return 1;

        int ans = FindPowAlt(p, q / 2);
        return q % 2 == 0 ? ans * ans : ans * ans * p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The P(base) and Q(power) : ");
        int p = sc.nextInt(), q = sc.nextInt();

        System.out.print(FindPowAlt(p, q));

        sc.close();
    }
}