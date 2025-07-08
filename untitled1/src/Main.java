import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[]= new int[size];

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        boolean found=false;
        for(int i=0;i<size;i++){
            if(num[i]==x){
                System.out.println(i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}


