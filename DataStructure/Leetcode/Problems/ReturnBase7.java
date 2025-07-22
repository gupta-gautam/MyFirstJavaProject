import java.util.*;

public class ReturnBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ReturnBase7 obj = new ReturnBase7(); // create object to call non-static method
        String d = obj.convertToBase7(num);
                System.out.println(d);
    }

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}