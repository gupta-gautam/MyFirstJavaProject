public class PrintFactorial {
    public static void printFactorial(int n, int factorial) {
        if (n == 0) {
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        printFactorial(n - 1, factorial);

    }

    public static void main(String[] args) {
        printFactorial(5, 1);
    }
}
