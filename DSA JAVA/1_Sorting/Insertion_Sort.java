public class Insertion_Sort {
    static void PrintArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int curr = arr[i];
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 41, 25, 12, 32, 65, 98, 25, 0 };
        int arr[] = {1,2,3,4,5,31,58,63,24};

        InsertionSort(arr);

        PrintArr(arr);
    }
}
