// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of
// the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// Input: [0,5,0,3,4,2]
// Output:[5,3,4,2,0,0]

public class Pra_Q_1 {
    static void PrintArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }


    //loop like bubble sort
    static void MoveZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j] != arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag == false)
                break;
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 0, 5, 0, 3, 4, 2 };
        int arr[] = {0,0,0,0,31,0,0,24};

        MoveZeros(arr);

        PrintArr(arr);
    }
}
