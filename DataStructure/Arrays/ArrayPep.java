public class ArrayPep {
    public static void main(String[] args) {
        int [] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;
        int[] two =one;
        two [1] = 200;
        for(int i=0;i<two.length;i++){
            System.out.println(two[i]);
        }
    }
}
