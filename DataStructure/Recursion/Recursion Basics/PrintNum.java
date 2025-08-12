public class PrintNum {
    public static void printNums(int n) {
        if (n == 0) { // base class or condition
            return;
        }
        // saare num print krane hote toh base class mai sout nhi likhte
        System.out.println(n); //print
        printNums(n - 1); // recursion
    }

    public static void main(String[] args) {
        int n = 5;
        printNums(n); // n=5
    }
}