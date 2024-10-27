import java.util.Scanner;
public class Linier_Search {
    //simple linier search using recursion return index / TC = O(n)
    public static int SearchEleIndex(int[] arr,int x,int index){
        if(arr[index] == x) return index;
        if(index == arr.length - 1) return -1;
        return SearchEleIndex(arr, x, index+1);
    }

    //simple linier search using recursion  return true or false / TC = O(n)
    public static boolean SearchEle(int[] arr,int x,int index){
        if(arr[index] == x) return true;
        if(index == arr.length - 1) return false;
        return SearchEle(arr, x, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,8,6,9,10,25};

        System.out.print("Enter The X value so you find in Array : ");
        int x = sc.nextInt();

        // System.out.print(SearchEle(arr,x,0));
        System.out.print(SearchEleIndex(arr,x,0));
        sc.close();
    }
}
