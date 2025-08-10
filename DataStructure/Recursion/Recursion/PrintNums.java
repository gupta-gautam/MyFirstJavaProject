public class PrintNums {
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n); // saare num print krane hote toh base class mai sout nhi likhte
        printNum(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n); // n=1
    }
}
