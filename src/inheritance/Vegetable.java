package inheritance;

public class Vegetable extends Food{

  public String color;


  @Override
  public String toString() {
    return "Vegetable{" +
      "color='" + color + '\'' +
      "} " + super.toString();
  }
}
