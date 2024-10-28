import java.util.Scanner;

public class Binary_Search {

    static int BinarySearchLoop(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }

    public static int BinarySearchRecursive(int[] arr, int st, int end, int target) {
        // int mid = (st + end) / 2;
        int mid = st + (end-st)/2; //this is better way to avoid overflow
        if(st > end) return -1;
        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid]) {
            return BinarySearchRecursive(arr, st, mid - 1, target);
        } else
            return BinarySearchRecursive(arr, mid + 1, end, target);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 11, 14, 18, 19, 25, 35, 75, 89, 90, 91, 97 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Eelement You Want to Search : ");
        int target = sc.nextInt();

        // int index = BinarySearchLoop(arr, target);
        int index = BinarySearchRecursive(arr, 0, arr.length - 1, target);
        System.out.print(target + " Number is Present in index : " + index);

        sc.close();
    }
}