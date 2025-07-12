import java.util.*;

public class BarChartArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int num[] = new int[arr];

        for (int i = 0; i < arr; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
