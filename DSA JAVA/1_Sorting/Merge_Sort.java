public class Merge_Sort {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add this to separate lines of output
    }

    static void Merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int[] temp = new int[end - start + 1];
        int k = 0;

        // Merge both halves into temp[]
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for (int m = 0; m < temp.length; m++) {
            arr[start + m] = temp[m];
        }
    }

    static void mergesort(int[] arr, int start, int end) {
        if (start >= end) return;  // Correct base case

        int mid = (start + end) / 2;  // Correct division
        mergesort(arr, start, mid);   // Recursively sort left half
        mergesort(arr, mid + 1, end); // Recursively sort right half
        Merge(arr, start, mid, end);  // Merge the sorted halves
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 8, 5, 6, 7};
        printArr(arr);  // Print original array
        mergesort(arr, 0, arr.length - 1);  // Sort the array
        printArr(arr);  // Print sorted array
    }
}
