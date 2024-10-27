import java.util.Scanner;
import java.util.ArrayList;

public class SubSquence {

    // print subseq SC = O(n²)
    public static void PrintSubSeq(String s,String empty){
        if(s.length() == 0){
            System.out.print(empty + " ,");
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        PrintSubSeq(remString, empty+curr); 
        PrintSubSeq(remString, empty);
    }

    // return array of all the subseq SP = O(2ⁿ)
    public static ArrayList<String> CountSubSeq(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }

        char currChar = s.charAt(0);
        ArrayList<String> ans = CountSubSeq(s.substring(1));

        for (String sub : ans) {
            result.add(sub);
            result.add(currChar + sub);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Without Space: ");
        String s = sc.next();

        // ArrayList<String> sub = CountSubSeq(s);
        // System.out.print(sub);

        PrintSubSeq(s,"");

        sc.close();
    }
}
