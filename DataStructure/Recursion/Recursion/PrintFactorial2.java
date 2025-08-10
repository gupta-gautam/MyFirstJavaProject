public class PrintFactorial2 {
    public static int calcFactorial(int n){
      // parameter mai bs n h isliye sout main wale mai likha h
        if(n==1||n==0){;
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact_n  = n* fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
       int ans = calcFactorial(5);
        System.out.println(ans);

    }
}
