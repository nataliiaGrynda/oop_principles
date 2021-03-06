package polymorphism;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
  public static void main(String[] args) {
    /*
    "Alex", "john", "Max"
    1,2,3,4,5,
    'x', '&'
     */

  Object [] elements= {5,10,5, '*', true, new Dog(), new Scanner(System.in), new ArrayList<>(), new String[5]};

    for (Object element : elements) {
      System.out.println(element.getClass().getSimpleName());
    }

    Dog dog1 = (Dog)elements[5];
    dog1.bark();;
    dog1.sleep();
    String name = (String) elements[3];
    System.out.println(name.startsWith("A"));

  }
}
