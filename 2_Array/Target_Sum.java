/*Give target possible sum of 3 element in array */

import java.util.Scanner;

public class Target_Sum {

    public static void Sum_Pairs(int[] arr,int sum){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println("{ "+arr[i]+" , "+arr[j]+" , "+arr[k]+" }");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Hello");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter The Element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter The Target SUM you want : ");
        int x = sc.nextInt();

        Sum_Pairs(arr,x);

        sc.close();
    }
}