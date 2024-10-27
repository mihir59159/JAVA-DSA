import java.util.Scanner;

public class MultiPlication_Matrix {

    static Scanner sc = new Scanner(System.in);

    public static void Print2DArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Input2DArr(int[][] arr,int row,int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public static void Maltiplication(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.print("Matrix r1 column and r2 row amount need to be the same.");
            return;
        }

        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        Print2DArr(result);

        return;
    }

    public static void main(String[] args) {
        // int[][] arr = new int[3][3];

        System.out.println("Enter The Rows and Cols for Matrix 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter The Rows and Cols for Matrix 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter The First Matrix Element " + r1 + " X " + c1);
        Input2DArr(arr1,r1,c1);
        System.out.println("Enter The Second Matrix Element " + r1 + " X " + c1);
        Input2DArr(arr2,r2,c2);

        Maltiplication(arr1, r1, c1, arr2, r2, c2);
        // Input2DArr(arr);

        // System.out.println("The First Matrix is :: ");
        // Print2DArr(arr1);
    }
}
