class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // PARAMETERISE CONSTRUCTORS
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParameteriseConstructors {
    public static void main(String[] args) {
        Students s1 = new Students("Aman", 24);
        s1.printInfo();
    }
}


