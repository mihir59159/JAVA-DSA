public class Selection_Sort {
    static void PrintArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int flag = i;  
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[flag])
                    flag = j;
            }
            int temp = arr[i];
            arr[i] = arr[flag];
            arr[flag] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 41, 25, 12, 32, 65, 98, 25, 0 ,101};
        // int arr[] = {1,2,3,4,5,31,58,63,24};

        SelectionSort(arr);

        PrintArr(arr);
    }
}
