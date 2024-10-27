import java.util.ArrayList;
import java.util.Scanner;

public class Return_Combination {

    static void CombinationCreate(String[] arr, String n, int i, ArrayList<String> list, String val) {
        if (i == n.length()) {
            list.add(val);
            return;
        }

        int curr = n.charAt(i) - '0';
        // System.out.println(curr);
        String currval = arr[curr];

        for (int j = 0; j < currval.length(); j++) {
            CombinationCreate(arr, n, i + 1, list, val + currval.charAt(j));
        }

        return;
    }

    public static void main(String[] args) {
        String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Between (2-9) : ");
        String num = sc.next();

        ArrayList<String> li = new ArrayList<>();
        CombinationCreate(arr, num, 0, li, "");
        System.out.print(li);
    }
}