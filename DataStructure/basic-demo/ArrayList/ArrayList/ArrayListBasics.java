import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        // to add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "->" + list.size());

        // to insert
        list.add(1, 1000);
        System.out.println(list + "->" + list.size());

        // to get
        int val = list.get(1); // not list [1]
        System.out.println(val);

        // to set
        list.set(1,2000);  //  not list [1] = 2000;
        System.out.println(list + "->" + list.size());

        // to remove
        list.remove(1);
        System.out.println(list + "->" + list.size());

    }
}