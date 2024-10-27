public class Reverse_Array {

    static int[] ArrayReverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        // for(int i = 0;i<n; i++){
        // ans[n-i-1] = arr[i];
        // }

        int j = 0, i = n - 1;
        while (i >= 0) {
            // ans[n - i - 1] = arr[i--];
            ans[j++] = arr[i--];
        }

        return ans;
    }

    public static void Swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static int[] ArrayReverseEff(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            Swap(arr, left, right);
            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15, 16, 17 };

        // int RevArr[] = ArrayReverse(arr);
        int NewRevArr[] = ArrayReverseEff(arr);

        for (int E : NewRevArr) {
            System.out.print(E + " ");
        }

    }
}
