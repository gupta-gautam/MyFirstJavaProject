import java.util.*;

public class ArrayListBasics1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bello");
        list.add("Cello");
        System.out.println(list + "->" + list.size());
        System.out.println(list);
    }
}
