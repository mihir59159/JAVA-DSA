import java.util.Scanner;
import java.util.ArrayList;

public class Linier_Search_All_Index {

    //this is with arrayList 
    static void AllIndex(int[] arr, int target, int index, ArrayList<Integer> li) {
        if (index == arr.length)
            return;
        if (arr[index] == target)
            li.add(index);
        AllIndex(arr, target, index + 1, li);
    }


    //this is direct print
    public static void SearchAllEle(int[] arr, int target, int index) {
        if (index == arr.length)
            return;
        if (arr[index] == target)
            System.out.print(index + " ");
        SearchAllEle(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 7, 8, 6, 9, 10, 25, 6, 6, 10, 8, 9, 7, 6 };

        System.out.print("Enter The X value so you find in Array : ");
        int x = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        AllIndex(arr, x, 0, result);
        System.out.println(result);

        SearchAllEle(arr, x, 0);

        sc.close();
    }
}
