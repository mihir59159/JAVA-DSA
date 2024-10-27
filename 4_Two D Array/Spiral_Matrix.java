//give matrix ele in form of spiral order

import java.util.Scanner;

public class Spiral_Matrix {

    public static void SpiralMatrixOrederWhilieLoop(int[][] arr, int rows, int cols) {
        int i = 1;
        int top = 0, bottom = rows - i, left = 0, right = cols - i;
        while (left <= right && top <= bottom) {//
            while (left <= right && left <= right && top <= bottom) {
                System.out.print(arr[top][left] + " ");
                left++;
            }
            left = top;
            top++;
            while (top <= bottom && left <= right && top <= bottom) {  
                System.out.print(arr[top][right] + " ");
                top++;
            }
            top = left + 1;
            right--;
            while (right >= left && left <= right && top <= bottom) {
                System.out.print(arr[bottom][right] + " ");
                right--;
            }
            i++;
            right = cols - i;
            bottom--;
            while (bottom >= top && left <= right && top <= bottom) {
                System.out.print(arr[bottom][left] + " ");
                bottom--;
            }
            bottom = rows - i;

            left++;
        }
    }
    public static void SpiralMatrixOrederForLoop(int[][] arr, int rows, int cols) {
        int totalElement = 0;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (totalElement < rows*cols) {//

            for(int i = left; i <= right && totalElement < rows*cols; i++){ //if you don't give condition then once the verify condition and after all 4 loop are implement (3 * 4 matrix)
                System.out.print(arr[top][i] + " ");
                totalElement++;
            }
            top++;
            for(int i = top; i <= bottom  && totalElement < rows*cols; i++){
                System.out.print(arr[i][right] + " ");
                totalElement++;
            }
            right--;
            for(int i = right; i >= left && totalElement < rows*cols; i--){
                System.out.print(arr[bottom][i] + " ");
                totalElement++;
            }
            bottom--;
            for(int i = bottom; i >= top && totalElement < rows*cols; i--){
                System.out.print(arr[i][left] + " ");
                totalElement++;
            }
            left++;
        }
    }

    public static void InputMatrix(int[][] arr, int rows, int cols) {
        System.out.println("Enter The " + rows + " X " + cols + " Matrix");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows and Cols of Matrix : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        InputMatrix(matrix, rows, cols);
        SpiralMatrixOrederWhilieLoop(matrix,rows,cols);
        // SpiralMatrixOrederForLoop(matrix,rows,cols);
        sc.close();
    }
}