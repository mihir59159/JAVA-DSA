/*
 * Given an integer array 'a' sorted in non-decreaslng
order, return an array of the squares of each number
sorted in non-decreasing order.
 */

import java.util.Scanner;

public class Sort_All_Two_Pointer {

    // public static int[] SwapInArray(int arr[], int a, int b) {
    // int temp = arr[a];
    // arr[a] = arr[b];
    // arr[b] = temp;

    // return arr;
    // }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SortAllEle(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int i = n - 1;

        while (left <= right) {
            int a = arr[left] * arr[left];
            int b = arr[right] * arr[right];

            if (a > b) {
                ans[i--] = a;
                left++;
            } else {
                ans[i--] = b;
                right--;
            }
        }

        PrintArray(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.err.println("Enter the Element Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Befor squares : ");
        PrintArray(arr);
        
        System.out.print("Array After squares : ");
        SortAllEle(arr);

        sc.close();
    }
}
