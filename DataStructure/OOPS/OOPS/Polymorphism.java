class Studen {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Studen s1 = new Studen();
        s1.name = "Aman";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);
    }
}
