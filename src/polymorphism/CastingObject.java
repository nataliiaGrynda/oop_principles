package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
  public static void main(String[] args) {

    Cat cat1 = new Cat();//no casting

    /*
    up casting putting smaller data into bigger happens implicitly
     */
    Animal animal1 = new Cat();// upcasting ... cat in the shape of animal
    Object object1 = new Cat();//upcasting cat in the shape of object

    List<Animal> animals = new ArrayList<>();//upcasting arrayList in the shape os list

    /*
    down casting
    putting bigger data into smaller it happen explicitly
    but, there must be data loss with primitives
    there can be exception thrown with objects if done improperly
     */
    /*
    Dog dog1 = (Dog) new Animal();//
    System.out.println(dog1);//location
    immediate use of down-casting is not possible and you will get ClassCastException with that
*/
    Animal a1 = new Dog();// this is a dog in the shape of animal (up-cating)
    Dog dog1 = (Dog) a1;// down-casting back to animal

    a1.eat();
    dog1.eat();//dog eats





  }
}
