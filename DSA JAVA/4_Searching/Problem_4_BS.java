//return index of target element in rotated array

//let difine some intruction
// 1 . st->mid or mid->end, out of two any one part always sorted in rotated array
//      eg.  7,8,9,10,1,2,3,4,5,6  --> mid is sopose 10, so 7->10 sorted or 10->6 sorted 
//      always one part is sorted or both path is sorted

import java.util.Scanner;

public class Problem_4_BS {
    public static int FindTargetInd(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[end]) { // mid->end is sorted
                if (target >= arr[mid] && target <= arr[end]) //check under range
                    st = mid + 1;
                else
                    end = mid - 1; //if not under range
            } else { //start -> mid sorted
                if (target <= arr[mid] && target >= arr[st]) { //check under range
                    end = mid - 1;
                } else
                    st = mid + 1;//if not under range
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7 };
        // int arr[] = { 1,1,1,1,2,3,3,3,0,0,1,1 };
        int arr[] = { 1,1,1,1,1,1,2,3,1,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element you want to search in rotated array : ");
        int target = sc.nextInt();
        System.out.print(FindTargetInd(arr, target));
        sc.close();
    }
}
