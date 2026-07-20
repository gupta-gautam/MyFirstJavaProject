import java.util.*;

public class LowerCase {
    public static String toLowerCase(String s){
        String ans = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            }
            ans += ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

       String ans =  toLowerCase(x);
        System.out.println(ans);
    }

}
