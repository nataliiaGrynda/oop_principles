package abstraction.abstract_classes;

public abstract class Phone {


  public Phone(){

  }

  public Phone(String brand, String color, int storage, double price){
    this.brand = brand;
    this.color = color;
    this.storage = storage;
    this.price = price;
  }

  public String brand;
  public String color;
  public int storage;
  public double price;



  //we can define what every phone should do
  public abstract void call();
  public abstract void ring();
  public abstract void text();
  public abstract boolean isConvertible();

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" +
      "brand='" + brand + '\'' +
      ", color='" + color + '\'' +
      ", storage=" + storage +
      ", price=" + price +
      '}';
  }
}
