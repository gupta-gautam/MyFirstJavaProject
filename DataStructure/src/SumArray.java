import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int num1[] = new int[n1];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int num2[] = new int[n2];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        // tertiary operators is like true false
        // if n1 >n2 then ans n1 or n2 >n1 then ans n2
        int c = 0;

        int i = num1.length - 1;
        int j = num2.length - 1;
        int k = sum.length - 1;

        /*Arrays in Java are 0-indexed, meaning:

First element is at index 0

Last element is at index length - 1

 */
        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += num1[i];
            }
            if (j >= 0) {
                d += num2[j];
            }
            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;

        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }
}