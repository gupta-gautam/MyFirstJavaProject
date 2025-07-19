import java.util.*;

public class StringsBasic {
    public static void main(String[] args) {
        // String declaration

        //  Eg: String name = "Tony";
        // String Full name = "Tony Stark";
        //   String sentence = "My name is Tony Stark";

       Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is:" + name);

        //1 ParseInt Method Of IntegerClass
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        // if in str 123a given then it will not convert into int
        // it will throw  number format exception

        //2 ToString Method of String class
        int num = 123;
        String strs = Integer.toString(num);
        System.out.println(str.length());
        // number is given so stirng is shown in length
    }
}
