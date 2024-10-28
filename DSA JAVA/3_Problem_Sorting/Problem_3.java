//leetcode que of three color , color red is 0 ,color blue is 1,color yellow is 2
//sort 0,1,2 in accending order in liner time and one pass also

public class Problem_3 {

    static void displayArr(int[] arr){
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    static void swapElements(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void SortColor(int[] arr) {
        int left = 0,right = arr.length - 1,mid = 0;
        
        while(mid <= right){
            switch (arr[mid]) {
                case 0:
                    swapElements(arr, left, mid);
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swapElements(arr, right, mid);
                    right--;
                    break;
        
                default: 
                    System.out.print("Plese enter Number between 0-2");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 0, 1, 2, 2, 1, 1, 0 };
        SortColor(arr);
        displayArr(arr);
    }
}