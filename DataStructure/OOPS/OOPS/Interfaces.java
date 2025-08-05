interface Animals {
    int eyes = 2;

    public void walk();
 /* Non Abstract function nhi hoga in Interfaces
    void eat(){
    } Constructor bhi nhi aaayga in Interfaces
    */

}
interface Herbivore{

}
class Horses implements Animals {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horses horse = new Horses();
        horse.walk();
    }
}
