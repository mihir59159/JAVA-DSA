//all positive right side and negative left side

public class Problem_2 {

    static void displayArr(int[] arr){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    static void swapEle(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortPluseMinese(int[] arr){
        int i = 0,j = arr.length - 1;
        
        while(i < j){
            while(arr[i] < 0) i++;
            while(arr[j] >= 0) j--; //consider 0 is positive
            
            if(i < j) swapEle(arr, i, j);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-2,-1,8,0,-5,-7,6,10};

        sortPluseMinese(arr);
        displayArr(arr);

    }
}
