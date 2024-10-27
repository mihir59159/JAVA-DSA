
//this is transport matrix , here InArray transpose code that why rows and cols size will be same
//you will rows and cols diff so diffrent code suggest.😊 
import java.util.Scanner;

public class Transpose_Matrix {
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        Print2DArr(arr);
    }

    public static void main(String[] args) {
        // in transport matrix rows and cols are same bcz this code is inArray Change
        // not create new
        System.out.println("Enter The Size Of Matrix : ");
        int n = sc.nextInt();

        int[][] arr1 = new int[n][n];

        System.out.println("Enter The First Matrix Element " + n + " X " + n);
        Input2DArr(arr1, n, n);

        TransposeMatrix(arr1,n);


    }
}
