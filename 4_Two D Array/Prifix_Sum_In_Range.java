//Cal Prefix Sum in Particular Range Using two - Efficient Way

import java.util.Scanner;

public class Prifix_Sum_In_Range {
    static Scanner sc = new Scanner(System.in);

    /*
     This is Create PrefixSum of All cols and rows cal and after that Cal
     */
    public static void PrefixSumCalEffe(int[][] arr, int query) {

        while (query > 0) {
            System.out.print("Enter The (l1,r1) (l2,r2) : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            int TopRight = 0, BottomLeft = 0, TopLeft = 0;

            if (l1 > 0) {
                TopRight = arr[l1 - 1][r2];
            }
            if (r1 > 0) {
                BottomLeft = arr[l2][r1 - 1];
            }
            if (l1 > 0 && r1 > 0) {
                TopLeft = arr[l1 - 1][r1 - 1];
            }
            int TotalSum = arr[l2][r2];

            int sum = TotalSum - TopRight - BottomLeft + TopLeft;

            System.out.println("Sum of elements in the given range is " + sum);
            query--;
        }
    }

    public static void PrefixArrayCreateEffe(int[][] arr, int[][] Prefix, int rows, int cols) {
        // for rows
        for (int i = 0; i < rows; i++) {
            Prefix[i][0] = arr[i][0];
            for (int j = 1; j < cols; j++) {
                Prefix[i][j] = arr[i][j] + Prefix[i][j - 1];
            }
        }
        // for cols
        for (int j = 0; j < cols; j++) {
            Prefix[0][j] = Prefix[0][j];
            for (int i = 1; i < rows; i++) {
                Prefix[i][j] = Prefix[i][j] + Prefix[i - 1][j];
            }
        }
    }

    /*This is Create Prefix Sum Matrix , here All Rows Prefix Sum Cal and after access one by one col and after that cal */

    public static void PrefixSumCal(int[][] arr, int query) {

        while (query > 0) {
            System.out.print("Enter The (l1,r1) (l2,r2) : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            int sum = 0;
            for (int i = l1; i <= l2; i++) {
                if (r1 < 1) {
                    sum = sum + arr[i][r2];
                } else {
                    sum = sum + arr[i][r2] - arr[i][r1 - 1];
                }
            }
            System.out.println("Sum of elements in the given range is " + sum);
            query--;
        }
    }

    public static void PrefixArrayCreate(int[][] arr, int[][] Prefix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            Prefix[i][0] = arr[i][0];
            for (int j = 1; j < cols; j++) {
                Prefix[i][j] = arr[i][j] + Prefix[i][j - 1];
            }
        }
    }

    public static void Print2DArr(int[][] arr,int rows,int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] < 10)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void InputMatrix(int[][] arr, int rows, int cols) {
        System.out.println("Enter The " + rows + " X " + cols + " Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Rows and Cols of Matrix : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        InputMatrix(matrix, rows, cols);

        int[][] PrefixMatrix = new int[rows][cols];

        // PrefixArrayCreate(matrix, PrefixMatrix, rows, cols);
        PrefixArrayCreateEffe(matrix, PrefixMatrix, rows, cols);
        Print2DArr(PrefixMatrix,rows,cols);

        System.out.print("Enter The Number Of Query ");
        int query = sc.nextInt();
        // PrefixSumCal(PrefixMatrix, query);
        PrefixSumCalEffe(PrefixMatrix, query);

        sc.close();
    }
}



/*Imporvement: Add Boundary in Code if l1,l2,r1,r2 is more then cols and rows*/
