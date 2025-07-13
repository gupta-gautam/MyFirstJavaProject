import java.util.*;

public class DiffArray {
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
        int diff[] = new int[n2];
        int c = 0;

        int i = num1.length - 1;
        int j = num2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int num1v = i >= 0 ? num1[i] : 0;

            if (num2[j] + c >= num1v) {
                d = num2[j] + c - num1v;
                c = 0;
            } else {
                d =  num2[j] + c + 10 - num1v;
                c = -1;
            }
            diff[k] = d;

            i--;
            j--;
            k--;
        }
        int idx =0;
        while(idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}

