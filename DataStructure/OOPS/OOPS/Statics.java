class Studens {
    String name;
    static String school;

    public static void changeSchool(){
        school = "new school";
    }
}

public class Statics {
    public static void main(String[] args) {
        Studens.school = "JMV";
        Studens student1 = new Studens();
        student1.name = "Tony";
        System.out.println(student1.school);
    }
}
