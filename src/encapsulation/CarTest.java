package encapsulation;

public class CarTest {
  public static void main(String[] args) {

//setting info for make
    Car car1 = new Car();
    car1.make = "BMW";

    //getting info for make
    System.out.println(car1.make);

     //setting info for year
    car1.setYear(2020);
    //getting info of year
    System.out.println(car1.getYear());


    car1.setPrice(5000, "abcd1234");// providing price
    System.out.println(car1.getPrice());// getting price


    System.out.println(car1.getIsConvertible());
  }
}
