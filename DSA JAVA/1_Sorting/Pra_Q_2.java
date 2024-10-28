// Give an array of names of the fruits; you are supposed to sort it in lexicographical(Dictionary) order using
// the selection sort
// Input :["papaya","lime","watermelon","apple","mango",'kiwi"]
// Output:["apple","kiwi","lime","mango","papaya","watermelon"]
public class Pra_Q_2 {

    static void PrintArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void DictionarySort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = { "papaya", "lime", "mangy", "watermelon", "apple", "mango", "kiwi" };
        DictionarySort(arr);
        PrintArr(arr);
    }
}
