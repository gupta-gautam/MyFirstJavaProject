import java.util.*;

public class CheckDuration {
    public static void main(String[] args) {
        int n = 10000;

        long start = System.currentTimeMillis();
      /*  String s = "";
        for(int i=0;i<n;i++){  By Strings
            s+=i;
        }
*/
        // By StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
