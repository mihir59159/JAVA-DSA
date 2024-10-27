import java.util.Scanner;

public class Rotate_Array {

    static void Rotate(int[] array, int target) {
        int n = array.length;
        target = target % array.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - target; i < n; i++) {
            ans[j++] = array[i];
        }
        for (int i = 0; i < n - target; i++) {
            ans[j++] = array[i];
        }
        printArray(ans);
    }

    public static int[] SwapInArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    static int[] ReverseArray(int arr[], int i, int j) {
        while (i < j) {
            SwapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    static void RotateIn(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        ReverseArray(arr, 0, n - k - 1);
        ReverseArray(arr, n - k, n - 1);
        ReverseArray(arr, 0, n - 1);
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 74, 68, 69, 25, 65 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number to Rotate Array : ");
        int target = sc.nextInt();

        // Rotate(arr, target);
        RotateIn(arr, target);

        sc.close();
    }
}
