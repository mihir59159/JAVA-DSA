import java.util.Scanner;

public class DSA_Q_2 {

    static void KeyAlfabat(String[] values, String num, String result) {
        if (num.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        int ch = num.charAt(0) - '0';

        String currVal = values[ch];

        for (int i = 0; i < currVal.length(); i++) {
            KeyAlfabat(values, num.substring(1), result + currVal.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Interger Value Of number : ");
        String num = sc.next();

        String[] values = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
        KeyAlfabat(values, num, "");
    }
}
