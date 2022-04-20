package abstraction_abstract_classes;

public class IPhone extends Phone{


  public static final String OS = "IOS";
  public IPhone(){

  }


  public IPhone(String brand, String color, int storage, double price) {
    super(brand, color, storage, price);
  }

  @Override
  public void call() {
    System.out.println("IPhone calls");
  }

  @Override
  public void ring() {
    System.out.println("IPhone rings");
  }

  @Override
  public void text() {
    System.out.println("IPhone texts");
  }

  @Override
  public boolean isConvertible() {
    return true;
  }
}
