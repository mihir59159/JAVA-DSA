import java.util.Scanner;

public class Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* RECTENGLE PATTEN */
        // System.out.print("Enter The Rows and Cols : ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= cols; j++) {
        // if (i == 1 || j == 1 || i == rows || j == cols)
        // System.out.print("* ");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        /* TRIENGLE PATTEN */
        // System.out.print("Enter The Num " );
        // int n = sc.nextInt();
        // for(int i=1 ; i <= n ; i++){
        // for(int j = 1; j <= n-i+1 ; j++ ) System.out.print("* ");
        // System.out.println();
        // }

        /* Centrel Triengle */
        // System.out.print("Enter The Num " );
        // int n = sc.nextInt();
        // for(int i=1 ; i <= n ; i++){
        // for(int k = 1; k <= n-i;k++) System.out.print(" ");
        // for(int j = 1; j <= i ; j++ ) System.out.print("* ");
        // System.out.println();
        // }

        /* Centrel Triengle */
        // System.out.print("Enter The Num " );
        // int n = sc.nextInt();
        // for(int i=1 ; i <= n ; i++){
        // for(int k = 1; k <= n-i;k++) System.out.print(" ");
        // for(int j = 1; j <= i*2-1 ; j++ ) System.out.print("*");
        // System.out.println();
        // }

        /* Numerical Rectangular Patten */
        // System.out.print("Enter The Num : " );
        // int n = sc.nextInt();
        // for(int i=1 ; i <= n ; i++){
        // for(int j = i; j <= n ; j++ ) System.out.print(j);
        // for(int k = 1; k < i;k++) System.out.print(k);
        // System.out.println();
        // }

        /* Toggle Rectangular Patten */
        // System.out.print("Enter The Rows and Cols : ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // for(int i=1 ; i <= rows ; i++){
        // for(int j = 1; j <= cols ; j++ ) {
        // if((i+j)%2 == 0){
        // System.out.print(1);
        // }else{
        // System.out.print(2);
        // }
        // }
        // System.out.println();
        // }

        /* Centrel Numerical Triengle */
        System.out.print("Enter The Num ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();
    }
}
