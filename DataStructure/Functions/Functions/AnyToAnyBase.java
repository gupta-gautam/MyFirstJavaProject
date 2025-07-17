import java.util.*;

public class AnyToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
int d = getValueInBase(n,b1,b2);
        System.out.println(d);
    }
    public static int getValueInBase(int n,int b1,int b2){
        int rv =0;
        int p=1;
        while(n>0){
            int dig = n%b2;
            n=n/b2;
            rv+=dig*p;
            p=p*b1;
        }
        return rv;
    }
}
