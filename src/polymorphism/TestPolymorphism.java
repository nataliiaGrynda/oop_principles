package polymorphism;

import java.util.LinkedList;

public class TestPolymorphism {
  public static void main(String[] args) {
    System.out.println(".....Testing animal objects.....");
    Animal a1 = new Animal();
    a1.eat();
    a1.sleep();

    System.out.println("......testing Dog object......");
    Dog d1 = new Dog();
    d1.eat();
    d1.sleep();
    d1.bark();


    System.out.println(".....Dog object in the shape of animal.......");


   Animal a2 = new Dog();//upcasting ... this is polymorphism
   a2.sleep();// dog sleeps
   a2.eat();// dog eats
    a2.eat("food");// animal eats food


  }
}
