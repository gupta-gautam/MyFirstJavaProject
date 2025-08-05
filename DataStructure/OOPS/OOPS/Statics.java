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
        Studens studens1 = new Studens();
        studens1.name = "Tony";
        System.out.println(studens1.school);
    }
}
