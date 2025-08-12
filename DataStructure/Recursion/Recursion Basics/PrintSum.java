public class PrintSum {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i; // this sum+=i is for last nth number to print as sum
            System.out.println(sum);  //i=5 n=5 tb sum print krke stops recursion by return
            return; //?
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i); // ye baad ka h bs i print dikhane ka
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
