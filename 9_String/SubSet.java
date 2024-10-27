//sum of all the subset

public class SubSet {
    static void SubSetPrint(int[] arr, int i, int sum) {
        if (i == arr.length) {
            System.out.print(sum + " ");
            return;
        }
        SubSetPrint(arr, i + 1, sum + arr[i]);
        SubSetPrint(arr, i + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };

        SubSetPrint(arr, 0, 0);

    }
}
