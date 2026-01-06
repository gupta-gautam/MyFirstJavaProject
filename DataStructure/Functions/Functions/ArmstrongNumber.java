import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int digit = 0;
        int temp = n;
// STEP-1 -> COUNT THE DIGITS
        while (temp > 0) {
            temp /= 10;
            digit++;
        }
// STEP-2 -> POWER SUM
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digit);
            n /= 10;
        }
// STEP-3 -> TRUE OR FALSE
        if (sum == original) {
            System.out.println("is a Armstrong Number");
        } else {
            System.out.println("is not a Armstrong Number");
        }
    }
}
