import java.util.*;

public class PerfectNumber {
    public static boolean perfect(int n) {
        if (n == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if(n %i== 0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        return n == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean ans = perfect(x);
        System.out.println(ans);
    }
}
