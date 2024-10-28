// 1,2,1,1,3,4,5,4,2,3,6

// 0|3|2|2|2|1|1   -> feq array
// 0,1,2,3,4,5,6

// 0|3|5|7|9|10|11 -> prefix sum of feq
// 0,1,2,3,4, 5, 6

// 1,1,1,2,2,3,3,4,4,5,6
// 0,1,2,3,4,5,6,7,8,9,10  -> this is based on 0 index so positon - 1 

public class CountSort {

    static void arrPrint(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static int FindMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void CountingSort(int[] arr) {

        int n = arr.length;
        int max = FindMax(arr);// find max element TC -> O(n)
        int[] feq = new int[max + 1];// create feqeuncy array

        int[] result = new int[n];// create result array they store final result

        for (int i = 0; i < n; i++) {// store the value in feq array TC -> O(n)
            feq[arr[i]]++;
        }

        for (int i = 1; i < feq.length; i++) {// calc prefix sum of feq array TC -> O(k) k is max element
            feq[i] += feq[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {// store final result TC -> O(n)
            int index = feq[arr[i]];// find position of arr element using feq array
            result[index - 1] = arr[i];// sotre ele value in result array / "index - 1 because position is 1 base index
                                       // and array is 0 base index"
            feq[arr[i]]--;// minus feq array count
        }

        for (int i = 0; i < n; i++) {// store result in real array TC -> O(n)
            arr[i] = result[i];
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 1, 3, 4, 5, 4, 2, 3, 6 }; // total TC -> O(n+k) n is length of array, k is max number in
                                                         // array

        CountingSort(arr);
        arrPrint(arr);

    }
}
