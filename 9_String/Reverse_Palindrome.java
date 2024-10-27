import java.util.Scanner;

public class Reverse_Palindrome {

    // TC = O(n)
    public static String ReverseStringSec(String s, int index) {
        if (index == s.length())
            return "";
        return ReverseStringSec(s, index + 1) + s.charAt(index);
    }

    //TC = may be O(n/2)
    public static boolean PalindromWithoutRev(String s, int l, int r) {
        if (l >= r)
            return true;
        return (s.charAt(l) == s.charAt(r) && PalindromWithoutRev(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String : ");
        String s1 = sc.nextLine();

        // String rev = ReverseStringSec(s1, 0);
        // System.out.println(rev);

        // if (s1.equals(rev))
        // System.out.print("This is Palindrome");
        // else
        // System.out.print("This is not Palindrome");

        if (PalindromWithoutRev(s1, 0, s1.length() - 1))
            System.out.print("String is Palindrom");
        else
            System.out.print("String is not Palindrom");

        sc.close();
    }
}