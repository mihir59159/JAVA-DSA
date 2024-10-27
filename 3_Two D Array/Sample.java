import java.util.Scanner;

public class Sample {

    public static void Print2DArr(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if(arr[i][j] < 10)System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Input2DArr(int[][] arr) {
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        sc.close();
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        System.out.println("Enter The Input Of Array : ");
        Input2DArr(arr);

        System.out.println("The 2D array is : ");
        Print2DArr(arr);
    }
}