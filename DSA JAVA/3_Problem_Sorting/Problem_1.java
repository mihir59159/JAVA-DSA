// Given an array where all its elements are sorted in increasing order except two
// swapped elements, sort it in linear time. Assume there are no duplicates in the array.
//                  .        .
// Input: A[] = [3, 8, 6, 7, 5, 9, 10]
// Output: A[] = [3, 5, 6, 7, 8, 9, 10]

public class Problem_1 {

    static void sovleArray(int[] arr) {
        int f = -1, s = -1;
        if(arr.length <= 1){//edge case/corner case "focus on interview"
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if(f == -1){ //first conflict
                    f = i - 1;
                    s = i; //this condition is only two length of array
                }else{ // second conflict
                    s = i;
                }
            }
        }
        if (f > 0 && s > 0) {
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, 5, 9, 10 };
        // int[] arr = { 3, 5, 6, 7, 8, 10, 9 };
        // int[] arr = { 5, 3, 6, 7, 8, 9, 10 };

        sovleArray(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}