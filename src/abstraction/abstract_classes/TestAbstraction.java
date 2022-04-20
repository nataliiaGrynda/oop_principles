package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
  public static void main(String[] args) {

    /*
    create the object os samsung called s1
     */
    Samsung s1 = new Samsung("Samsung","Black",64, 700 );
    Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
    IPhone i1 = new IPhone("Apple", "silver", 128, 1000);


    List<Phone> phones = new ArrayList<>();
    phones.add(s1);
    phones.add(n1);
    phones.add(i1);

    /*
    print all objects one by one
    find and print the most expensive with the massage: the most expensive phone = Ipone
    find and print how many phones are convertible. -> 2
     */

    int count = 0;
    int max = Integer.MIN_VALUE;
    Phone mostExpensivePhone = null;

    for (Phone phone : phones) {
      System.out.println(phone);
      if(phone.isConvertible()) count++;
      if(phone.price > max) mostExpensivePhone = phone;
    }
    System.out.println(count);
    System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());

    System.out.println(IPhone.OS);//INVOKING STATIC INSTANT VARIBLES
    System.out.println(Nokia.OS);
    System.out.println(Samsung.OS);

    for (Phone phone : phones) {
      phone.call();
      phone.ring();
      phone.text();
    }
  }
}
