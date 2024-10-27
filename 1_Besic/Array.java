// import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);

        // for(int i = 0; i < 5;i++){
        //     System.out.print("Enter "+(i+1)+" Number : ");
        //     arr[i] = sc.nextInt();
        // }

        // for(int i = 0; i < 5;i++){
        //     System.out.print(arr[i]);
        // }



        // /*Shallow Copy */
        // int arr[] = {1,8,6,7,9};
        // int arr2[] = arr;

        // System.out.println("Array Before Chnage "+arr[0]);
        // arr2[0] = 52;
        // System.out.println("Array After Chnage "+arr[0]);
        //if you update arr2 so also change arr bcz in array java is perform operation in heap memory that's why array is change 
        //arr and arr2 are refre same memory address
        //this is possible only array not variable 




        /*Deep Copy */
        int arr[] = {13,8,6,7,9};
        // int arr2[] = arr.clone(); //full array copy
        // int arr2[] = Arrays.copyOf(arr,arr.length); // only start to specific range copy
        int arr2[] = Arrays.copyOfRange(arr, 2, arr.length); //specific range copy , start to end

        System.out.println("Array Before Chnage "+arr[0]);
        arr2[0] = 52;
        System.out.println("Array After Chnage "+arr[0]);
        //in this case arr is not change of changes of arr2
        //because arr2 is copy of arr in heap memory that's why arr and arr2 are diffrent memory location


    }
}
