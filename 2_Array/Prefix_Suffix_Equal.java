/*Check if we can partition the array into two subarrays with equal sum. More
formally, check that the prefix sum of a part of the array is equal to the suffix
sum of rest of the array. */

import java.util.Scanner;

public class Prefix_Suffix_Equal {

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int CheackTotalSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int EqualPrefixSuffix(int arr[]) {
    int n = arr.length;
    int prefixSum = 0;
    int totalSum = CheackTotalSum(arr);
    for (int i = 0; i < n; i++) {
    prefixSum += arr[i];
    if (prefixSum == totalSum - prefixSum) {
    return i;
    }
    }
    return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size Of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.err.println("Enter the Element OF Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = EqualPrefixSuffix(arr);
        if (index != -1) {
            System.out.print("\nSub Array One is : ");
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("\nSub Array Two is : ");
            for (int i = index + 1; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("\nNo Equal Prefix Suffix Found");
        }


        sc.close();
    }
}
