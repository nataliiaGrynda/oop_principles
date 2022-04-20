package abstraction_abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
  public static void main(String[] args) {


    Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
    Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
    IPhone i1 = new IPhone("Apple", "Silver", 120, 1000);

    List<Phone> phones = new ArrayList<>();

    phones.add(s1);
    phones.add(n1);
    phones.add(i1);

/*
print all objects
find and print the most expenceve with the massege "the most expensive phone is = IPhone
find and print how many phones are convetible -. 2
 */


    int countConvertibles = 0;
    int max = Integer.MIN_VALUE;
    Phone mostExpensivePhone = null;
    for (Phone phone : phones) {
      if (phone.isConvertible()) countConvertibles++;
      if (phone.price > max) mostExpensivePhone = phone;
    }

    System.out.println(countConvertibles);
    System.out.println("The most expensive phone is  = " + mostExpensivePhone.getClass().getSimpleName());
    System.out.println("The color of the most expensive phone is = " + mostExpensivePhone.color);
    System.out.println(IPhone.OS);// invoking static instance variables
    System.out.println(Samsung.OS);
    System.out.println(Nokia.OS);

    for (Phone phone1 : phones) {
      phone1.call();
      phone1.ring();
      phone1.text();
    }


  }
}
