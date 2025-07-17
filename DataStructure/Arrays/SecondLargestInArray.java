import java.util.*;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int max = largest(num);
        int secondMax = secondLargest(num, max);
        System.out.println(secondMax);
    }

    public static int largest(int[] num) {
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
//        System.out.println(max);
        return max;
    }

    public static int secondLargest(int[] num, int max) {
        boolean found = false;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {

            if(num[i] != max && num[i] > secondLargest){
                secondLargest = num[i];
                found = true;
            }
        }

        return found ? secondLargest : -1;
    }

}
