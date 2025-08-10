public class PrintSum2 {
    public static void printSums(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSums(n - 1, sum);

    }

    public static void main(String[] args) {
        printSums(5, 0);
    }
}
