/*
 * Partetion - arr(arr,i,j) 
 *                  pivot left small and right is large
 *                  int part = return pivot ele
 * quick - arr(arr,start,part-1)
 *          arr(arr,part+1,end)
 * 
 * arr(arr,0,length-1)
 */

public class Quick_Sort {

    static void arrPrint(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partetion(int[] arr, int start, int end) {

        int pivot = arr[start];
        // int pi = (int)Math.abs(Math.random() * (end - start +1)); random pivot
        // int pivot = arr[pi]; //random pivot
        int i = start;
        int j = end;

        while (i < j) {

            // i++ if ele is less then or equal to pivot ele
            while (arr[i] <= pivot && i < end)
                i++;

            // j-- if ele is greater then pivot ele
            while (arr[j] > pivot)
                j--;

            // i and j swap because i required small ele then pivot and j requie large ele
            // then pivot
            if (i < j)
                swapArr(arr, i, j);
        }

        // swap final pivot ele with j , because j is stop when that ele is lessthen
        // pivot and pivot ele is allready start means smaller side
        swapArr(arr, start, j);
        //swapArr(arr, pi, j); rendom pivot
        return j;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pi = partetion(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 1, 4, 5, 3, 2, 8, 6, 7 };

        quickSort(arr, 0, arr.length - 1);

        arrPrint(arr);
    }
}