import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;//0101->0111->dec 7 in for 1
        int pos = 1;
        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNum = bitMask | n;
            System.out.println(newNum);
        } else {
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
        }
    }
}
