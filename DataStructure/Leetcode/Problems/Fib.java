public class Fib {
    public static int printFib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        printFib(10);

    }
}
