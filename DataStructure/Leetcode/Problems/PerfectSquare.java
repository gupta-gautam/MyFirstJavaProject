import java.util.*;

public class PerfectSquare {
    public static boolean perfectSquare(int num){
        long left =0;
        long right = num;
        while(left <= right){
            long mid = left + (right - left)/2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        boolean ans = perfectSquare(num);
        System.out.println(ans);
    }
}
