/*
 * Partetion - arr(arr,i,j) 
 *                  pevet left small and right is large
 *                  int part = return pevet ele
 * quick - arr(arr,start,part-1)
 *          arr(arr,part+1,end)
 * 
 * arr(arr,0,length-1)
 */

public class temp {

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

    static int partetion(int[] arr, int i, int j) {

        int pevet = i;

        while (i < j) {
            while (arr[i] <= arr[pevet] && i <j) {
                i++;
            }
            while (arr[j] > arr[pevet])
                j--;

            if (i < j)
                swapArr(arr, i, j);
        }
        swapArr(arr, pevet, j);
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
        int[] arr = {10,1, 1, 4, 5, 3, 1,2, 8, 6, 7 ,0};

        quickSort(arr, 0, arr.length - 1);

        // arrPrint(arr);
    }
}