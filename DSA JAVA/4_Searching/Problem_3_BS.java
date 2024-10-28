//find the minimum element from rotated array
//find the pivot element in array

public class Problem_3_BS {

    public static int FinaMin(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int index = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[n - 1]) {
                index = mid;
                end = mid - 1;
            } else
                st = mid + 1;

        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 1, 2, 3 };
        System.out.print(FinaMin(arr));
    }
}
