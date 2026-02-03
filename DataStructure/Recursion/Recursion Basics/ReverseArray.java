import java.util.*;

public class ReverseArray {
    public static void reverse(int a[],int l,int r){
        if(l>=r) return;
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        reverse(a,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        reverse(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
