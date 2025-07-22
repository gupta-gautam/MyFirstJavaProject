import java.util.*;

public class AdditionBinary {
    public static void main(String[] args) {
        AdditionBinary ab = new AdditionBinary();
        String a = "1011";
        String b = "1101";
        System.out.println(ab.addBinary(a, b)); // Output: 11000
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1; // Start from end of string a
        int j = b.length() - 1; // Start from end of string b
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int and move left
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2); // Current bit
            carry = sum / 2;        // Carry to next bit
        }

        return result.reverse().toString(); // Reverse final result
    }
}