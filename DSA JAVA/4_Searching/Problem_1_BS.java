//find first occurance in sorted array
public class Problem_1_BS {

    static int findOccurance(int[] arr,int target){
        int st = 0,end = arr.length - 1;
        int fo = -1;  //fo -> first ocurace
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                fo = mid;
                end = mid - 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return fo;
    }
    public static void main(String args[]){
        int[] arr = {0,1,1,2,2,2,3,5,5,5,8,8,9}; 
        int idfo = findOccurance(arr, 9);
        System.out.print("First Index is : "+ idfo);
    }
}
