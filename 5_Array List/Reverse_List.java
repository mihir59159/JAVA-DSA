import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 10, 45, 20, 32));

        //manually revevrse for pratice perpose
        // int i = 0, j = arr.size() - 1;
        // while (i < j) {
        //     Integer temp = arr.get(i);
        //     // System.out.print(Integer.valueOf(j));
        //     arr.set(i, arr.get(j));
        //     arr.set(j, temp);
        //     i++;
        //     j--;
        // }


        //this is inbuild method
        Collections.reverse(arr);
        Collections.sort(arr);
        Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr);
    }
}
