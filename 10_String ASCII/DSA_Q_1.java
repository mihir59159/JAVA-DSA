// There are N stones, numbered 0,1,2,.. .,N-I. For each i (0<i<N), the height
// of Stone i is hi.
// There is a frog who is initially on Stone 0. He will repeat the following
// action some number of times to reach
// Stone N-1 :
// If the frog is currently on Stone i, jump to Stone i+l or Stone i+2.
// Here, a cost of |hi - hj| is incurred, where j is the stone to land on.
// Find the minimum possible total cost incurred before the frog reaches Stone
// N.

// Input n = 4 //[10,30,40,20]
// Output= 30
// import java.util.Maths


public class DSA_Q_1 {
    static int SortestWay(int[] arr, int n, int i) {
        if (i == n - 1)
            return 0;

        int dist1 = Math.abs(arr[i] - arr[i + 1]) + SortestWay(arr, n, i + 1);
        if (i == n - 2)
            return dist1;
        int dist2 = Math.abs(arr[i] - arr[i + 2]) + SortestWay(arr, n, i + 2);
        return Math.min(dist1, dist2);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 40, 20, 10, 60, 30 };
        // SortestWay(arr,arr.length,0);
        System.out.print(SortestWay(arr, arr.length, 0));
    }
}