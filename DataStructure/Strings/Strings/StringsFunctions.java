import java.util.*;

public class StringsFunctions {
    public static void main(String[] args) {
        //1 concatenation;
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        //2 for length :- .length()
        System.out.println(fullName.length());

        //3 charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        //4 compare strings
        String name1 = "Tony";
        String name2 = "Tony";
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2  : -ve value
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // in this new string == equal to equal to not works so we used .compareTo
        if (new String("Tony") == new String("Tony")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        //5 Substrings
            String sentence = "My name is Tony";
            String name =sentence.substring(11,sentence.length());
            System.out.println(name);
        }
        //6 Strings are immutable
    }
}
