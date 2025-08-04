class Studet {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // COPY CONSTRUCTORS
    Studet(Studet s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // this is constructor for s1
    Studet() {

    }
}

public class CopyConstructors {
    public static void main(String[] args) {
        Studet s1 = new Studet();
        s1.name = "aman";
        s1.age = 24;

        Studet s2 = new Studet(s1);
        s2.printInfo();
    }
}
