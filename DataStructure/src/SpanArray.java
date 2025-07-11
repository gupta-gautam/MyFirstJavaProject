import java.util.*;
public class SpanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int num[] = new int [arr];

        for(int i=0;i<arr;i++){
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
// or we can write beside this max min
        //int max =arr[0];
        //int min = arr[0];
        for(int i=0;i<num.length;i++){
            if(num[i]> max){
                  max = num[i];
            }
            if(num[i]<min){
                min = num[i];
            }

        }
        System.out.println(max-min);
    }
}
