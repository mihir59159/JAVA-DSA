// 121, 45, 258, 32, 9, 745, 12, 5, 485

/*  121     121       5       5
     45      32       9       9
    258      12      12      12   
     32      45     121      32
      9     745      32      45
    745       5      45     121
     12     485     745     258
      5     258     258     485
    485       9     485     745

    que   first    second   third  --> row
 */

public class RadixSort {

    static void arrPrint(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

        
    static int FindMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void radixSort(int[] arr, int val) {
        int max = FindMax(arr);
        if(max/val == 0) return;

        int[] feq = new int[10];
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) { // making feq array
            feq[(arr[i] / val) % 10]++;
        }

        for (int i = 1; i < 10; i++) { // doing prefix sum
            feq[i] += feq[i - 1];
        }

        for (int i = n-1; i >= 0; i--) { // result array filling 
            result[feq[(arr[i] / val) % 10] - 1] = arr[i];
            feq[(arr[i]/val)%10]--;
        }

        for (int i = 0; i < n; i++) { //copy in real array
            arr[i] = result[i];
        }

        radixSort(arr,val*10);
    }

    public static void main(String[] args) {
        int[] arr = {9999, 121, 45, 258, 32, 9, 745, 12, 5, 485,1452 };
        radixSort(arr,1);

        arrPrint(arr);
    }
}
