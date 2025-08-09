public class Recursion1 {
    public static void printNums(int n) {
        if (n == 0) { // base class or condition
            return;
        }
        System.out.println(n); //print
        printNums(n - 1); // recursion
    }

    public static void main(String[] args) {
        int n = 5;
        printNums(n); // n=5
    }
}