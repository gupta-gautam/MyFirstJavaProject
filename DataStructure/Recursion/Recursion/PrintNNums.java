public class PrintNNums {
    public static void printNum(int i, int n) {
        if (i == n) {
            return;
        }
        System.out.println(i);
        // saare num print krane hote toh base class mai sout nhi likhte
        printNum(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(1, 50); // n=1
    }
}
