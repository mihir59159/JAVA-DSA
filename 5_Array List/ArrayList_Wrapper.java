import java.util.ArrayList;

public class ArrayList_Wrapper {
    public static void main(String[] args) {
        /*
         * int i = 14;
         * Integer in = Integer.valueOf(i);
         * 
         * Float fe = Float.valueOf(3.5f);
         * System.out.println(fe);
         */

        // create ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // Add
        l1.add(5);
        l1.add(8);
        l1.add(8);

        // Print
        System.out.println(l1);

        // Set ['Update ele in specific index']
        l1.set(1, 15);

        // Add new ele specific index But old not chnage
        l1.add(2, 50);

        // Print One by One
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }

        // remove ele in specific index
        l1.remove(2);

        l1.add(18);
        l1.add(8);
        l1.add(5);

        System.out.println("\n" + l1);

        // remove by ele if you don't know index
        l1.remove(Integer.valueOf(5));

        // Check The ele in list or not ['This return boolean value true or false']
        Boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        // if you don't declare data type so this is containe all type of data type
        // value
        ArrayList<Object> l = new ArrayList<>();

        l.add("all");
        l.add(2);
        l.add(false);

        System.out.println(l);

        System.out.println(l1);
        System.out.print(l1.lastIndexOf(Integer.valueOf(5)));

    }
}
