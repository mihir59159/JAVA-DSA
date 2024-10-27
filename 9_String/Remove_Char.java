import java.util.Scanner;

public class Remove_Char {

    // with recursion and without index TC = O(n²) [recursively + substring]
    public static String RemoveAllOccu(String s, char a) {
        if (s.length() == 0)
            return "";
        String ans = RemoveAllOccu(s.substring(1), a);
        if (s.charAt(0) != a)
            return s.charAt(0) + ans;
        return ans;
    }

    // with recursion and with recursion TC = O(n)) [recursively]
    public static String RemoveAllOcurance(String s, char a, int i) {
        if (i == s.length())
            return "";
        String ans = RemoveAllOcurance(s, a, i + 1);
        if (s.charAt(i) != a) {
            return s.charAt(i) + ans;
        }
        return ans;
    }

    // with iteration
    public static String RemoveChar(String s, char k) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != k)
                ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String : ");
        String s1 = sc.nextLine();

        System.out.print("Enter Char Do You Want Remove : ");
        char ch = sc.next().charAt(0);

        System.out.println(RemoveChar(s1, ch)); // itration
        System.out.println(RemoveAllOcurance(s1, ch, 0)); // recursion
        System.out.println(RemoveAllOccu(s1, ch)); // recursion
        sc.close();
    }
}