public class Bubble_Sort {

    static void PrintArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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
        int[] arr = { 1, 2, 3, 41, 25, 12, 32, 65, 98, 25, 0 };
        // int arr[] = {1,2,3,4,5,31,58,63,24};

        BubbleSort(arr);

        PrintArr(arr);
    }
}