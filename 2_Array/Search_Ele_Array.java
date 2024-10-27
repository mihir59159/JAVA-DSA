import java.util.Scanner;

public class Search_Ele_Array {

    static void FeqArray(int[] feq, int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            feq[arr[i]]++;
        }
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

        System.out.print("Enter the Num of Input Do You Want To Search : ");
        int num = sc.nextInt();

        // Max Element oF the array is less than 10^5 (100000)
        int feq[] = new int[100000];
        FeqArray(feq, arr);

        while (num > 0) {
            System.out.print("Enter The Number Do you Search : ");
            int q = sc.nextInt();

            if (feq[q] > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            num--;

        }
        sc.close();
    }
}
