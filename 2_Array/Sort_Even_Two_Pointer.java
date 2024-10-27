/*Given an array of integers 'a', move all the even integers at the
beginning of the array followed by all the odd integers. The
relative order of odd or even integers does not matter. Return
any array that satisfies the condition.*/

import java.util.Scanner;

public class Sort_Even_Two_Pointer {

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

    public static void EvenOdd(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                SwapInArray(arr, left, right);
            }
            while (arr[left] % 2 == 0) 
                left++;
            while (arr[right] % 2 != 0)
                right--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.err.println("Enter the Element Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Befor Soring : ");
        PrintArray(arr);

        EvenOdd(arr);

        System.out.print("Array After Sorting : ");
        PrintArray(arr);

        sc.close();
    }
}