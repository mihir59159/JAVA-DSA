//create spiral array

import java.util.Scanner;

public class Spiral_Matrix_2 {

    public static void Print2DArr(int[][] arr,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if(arr[i][j] < 10)System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void GenrateSpiral(int[][] arr, int n) {
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        int current = 1;

        while (current <= n * n) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = current++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = current++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = current++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = current++;
            } 
            left++;
        }

        Print2DArr(arr,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows and Cols of Matrix : ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        GenrateSpiral(matrix, n);
        // SpiralMatrixOrederForLoop(matrix,rows,cols);
        sc.close();
    }
}
