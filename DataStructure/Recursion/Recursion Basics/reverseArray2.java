import java.util.*;

public class reverseArray2 {
    public static void reverse(int a[],int i,int n){
        if(i>=n/2) return;
        int temp = a[i];
        a[i] = a[n-i-1];
         a[n-i-1] = temp;
        reverse(a,i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverse(a,0,n);

        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
