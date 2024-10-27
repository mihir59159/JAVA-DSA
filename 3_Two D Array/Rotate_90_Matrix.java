/*Rotate Matrix in 90" degree */

import java.util.Scanner;

public class Rotate_90_Matrix {

    static Scanner sc = new Scanner(System.in);

    public static void Print2DArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Input2DArr(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

    }

    public static void TransposeMatrix(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Print2DArr(arr);
    }

    public static void RotateMatrix(int[][] arr, int n) {
        TransposeMatrix(arr, n);

        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter The Size Of Matrix : ");
        int n = sc.nextInt();

        int[][] arr1 = new int[n][n];

        System.out.println("Enter The First Matrix Element " + n + " X " + n);
        Input2DArr(arr1, n, n);

        RotateMatrix(arr1, n);
        Print2DArr(arr1);
    }
}
