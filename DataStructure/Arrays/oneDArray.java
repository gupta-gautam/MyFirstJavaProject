import java.util.*;
public class oneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[]= new int [size];

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int x =sc.nextInt();
// int question return -1;
        //int idx = -1;
        for(int i =0;i<num.length;i++){
            if(num[i]==x){
            // idx = i;
                //break;}
                System.out.println(i);
            }
        }

    }

}
