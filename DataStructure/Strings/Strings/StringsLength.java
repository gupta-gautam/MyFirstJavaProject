import java.util.*;

public class StringsLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int Tolength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
//  take string input from the user and store it in an array at position i
            Tolength += array[i].length();
// adds the length of each string in the array to the variable Tolength
        }
        System.out.println(Tolength);
    }
}
