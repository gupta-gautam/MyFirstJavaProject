public class PrintNumsN1 {
    public static void printNums(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        printNums(i - 1);
    }

    public static void main(String[] args) {
        printNums(20);
    }
}
