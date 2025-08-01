public class SubstringPep {
    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
        String s1 = "hello";
        s1 += " "; // add krte h aise characters
        s1 += "w";
        s1 += "o";
        System.out.println(s1);
        System.out.println("hello" + 10 + 20);// isme strings h to 10 aur 20 string mai rehke 1020 ho jayga
        System.out.println(10 + 20 + "hello");//isme pehle integer h to add hokr then 30 hello print hoga

        String s2 = " abc def ghi ijk mno";
        String[] parts = s2.split(" ");// bich mai space h isliye bracket mai space diiya h agr comma hota toh comma se separate krte
        for (int i = 0; i < parts.length; i++) {// array h parts isliye parts.length likha
            System.out.println(parts[i]);
        }
    }
}
