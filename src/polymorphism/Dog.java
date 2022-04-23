package polymorphism;

public class Dog extends Animal {



  public void bark(){
    System.out.println("Dog barks");
  }

    //override Animal class eat and sleep method


  @Override
  public void sleep() {
    System.out.println("Dog sleep");
  }

  @Override
  public void eat() {
    System.out.println("Dog eat");

  }
}
