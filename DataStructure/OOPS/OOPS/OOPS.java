class Pen {
    String color;
    String type;  // ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // NON PARAMETERISE CONSTRUCTORS
    Student() {
        System.out.println("constructor called");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen1.type = "ballpoint";

        // pen1.printColor();
        //  pen2.printColor();
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo();
    }
}