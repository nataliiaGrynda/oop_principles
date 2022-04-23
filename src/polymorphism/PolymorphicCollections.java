package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
  public static void main(String[] args) {


    Cat cat1 = new Cat();
    Dog dog1 = new Dog();

    System.out.println("......cat object......\n");
    cat1.eat();
    cat1.sleep();
    cat1.eat("fish");

    System.out.println("......dog object.....\n");
    dog1.eat();
    dog1.sleep();
    dog1.eat("meat");

    System.out.println("......Animal object.....\n");

Animal animal1 = new Animal();
animal1.eat();
animal1.eat("some food");
animal1.sleep();

/*
Create a Cat and a Dog object in the shape of Animal
Invoke their eat() and sleep() methods which are zero arg
 */
    System.out.println(".....cat and dog objects......\n");
  Animal animal2 = new Cat();// object is cat
  Animal animal3 = new Dog();
animal2.eat();//cat eats
animal2.sleep();//cat sleeps
animal3.eat();
animal3.sleep();
//animal, cat, dog,

    Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

    for (Animal animal : animals) {// CAT, DOG, ANIMAL, CAT ,DOG
      System.out.println(animal.getClass().getSimpleName());
    }
    //store all objects in the arrayList and execute eat() method for each object

    System.out.println(".......arraylist of animals......\n");

    ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));

    for (Animal animal : animalList) {
     animal.eat();
    }
//animalList.forEach(Animal::eat); same as using loop on top.... lamnda expresion
    new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);//everything combine, it is lamnda expresion
  }
}