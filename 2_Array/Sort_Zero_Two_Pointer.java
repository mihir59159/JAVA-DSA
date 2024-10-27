/*Sort an Array consisting of only Os and Is. */
import java.util.Scanner;

public class Sort_Zero_Two_Pointer {

    public static int[] SwapInArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ZerosSort(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] > arr[right]) {
                SwapInArray(arr, left, right);
            }
            while (arr[left] == 0) //if(arr[left] == 0) this is same time in worst and best case but while reduce iteration in best case
                left++;
            while (arr[right] == 1)
                right--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.err.println("Enter the Element Of Array (0 - 1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Befor Soring : ");
        PrintArray(arr);

        ZerosSort(arr);

        System.out.print("Array After Sorting : ");
        PrintArray(arr);

        sc.close();
    }
}
