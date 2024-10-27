import java.util.Scanner;

public class PrefixSum_Range {

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int PrefixSumCal(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] PrefixSumMaking(int arr[], int newArr[]) {
        for (int i = 1; i < arr.length; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.err.println("Enter the Element Of Array : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] PrefixArr = new int[n + 1];
        PrefixArr = PrefixSumMaking(arr, PrefixArr);

        PrintArray(PrefixArr);

        int query = 1;
        while (query != 0) {
            System.out.print("Enter The Start Index and End Index : ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            // this is doing n iteration to every query
            // int sum = PrefixSumCal(arr, start, end);

            // this is only one time n iteration to all query
            int sum = PrefixArr[end] - PrefixArr[start - 1];

            System.out.println("the sum is : " + sum);

            System.out.print("If You Want Continue Press 1 otherwise 0 : ");
            query = sc.nextInt();
        }
        sc.close();
    }
}
