public class StringsBuilder {
    public static void main(String[] args) {
        //1 declaration of String Builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //2 char At Index 0
        System.out.println(sb.charAt(0));
        //3  set chr At index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //4 insert
        sb.insert(2, 'n');
        System.out.println(sb);
        //5 delete
        sb.delete(2, 3);
        // last index is not included in delete;
        System.out.println(sb);
        //6 Append
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("e"); // str = str + "e";
        sb1.append("l"); // str = str + "l";
        sb1.append("l"); // str = str + "l";
        sb1.append("o"); // str = str + "o";
        System.out.println(sb1.length());
    }
}
