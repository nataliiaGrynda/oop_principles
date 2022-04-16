package inheritance;

public class Tester extends Person {


  public Tester() {

  }

  public Tester(String fName, String lName, int age, String gender) {
    super.fName = fName;
    super.lName = lName;
    super.age = age;
    super.gender = gender;
  }


  public void code() {
    System.out.println("Tester code");
  }

  @Override
  public void eat() {
    System.out.println("Tester eats");//override with my own body
  }

  @Override
  public void sleep() {
    System.out.println("Tester sleep");
  }

  @Override
  public void learn() {
    System.out.println("Tester learns");
  }

  @Override
  public void walk() {
    System.out.println("Tester walks");
  }
}