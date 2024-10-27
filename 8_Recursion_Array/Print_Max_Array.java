public class Print_Max_Array {
    // this is only print array
    public static void PrintArray(int[] arr, int index) {
        if (index < 0)
            return;
        PrintArray(arr, index - 1);
        System.out.print(arr[index] + " ");
    }

    // return total sum of array
    public static int SumArray(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        return SumArray(arr, index + 1) + arr[index];
    }

    // max sum find TC = O(n)
    public static int maxNum(int[] arr, int index, int max) {
        if (index == arr.length)
            return max;
        return maxNum(arr, index + 1, max < arr[index] ? arr[index] : max); // you can also use Math.max
    }

    // max sum find TC = O(n)
    public static int maxNum2(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        int ans = maxNum2(arr, index + 1);
        return Math.max(ans, arr[index]); // you can also use Math.max
    }

    public static void main(String[] args) {
        // int arr[] = {100};
        int arr[] = { 100, 4, 8, 2, 3, 144, 5, 7, 85 };

        // PrintArray(arr, arr.length - 1);
        // System.out.print("\nMax Of This Array Is : " + maxNum(arr, 0,0));
        // System.out.print("\nMax Of This Array Is : " + maxNum2(arr, 0));
        System.out.print(SumArray(arr, 0));
    }
}