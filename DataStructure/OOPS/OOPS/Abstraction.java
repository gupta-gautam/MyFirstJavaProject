abstract class Animal {
    abstract void walk();

    // Constructor bnaya
    Animal() {
        System.out.println("You are creating a new Animal");
    }

    //NON ABSTRACT EG:- eat wala
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs ");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
       /* Animal animal = new Animal();
            animal.walk();
          ->  animal type ke object ko bna hi nhi skte
         ->   Animal abstract mai h usse initiate nhi krra ja skta
          ->      Runtime error face krne lgege run krege toh
                compilation mai red line nhi aaya but run krne ke baad
                error aayaa isliye runtime error h
        */
    }
}
