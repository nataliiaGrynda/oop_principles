package abstraction.abstract_classes;

public class IPhone extends Phone implements Camera, BlueTooth {

  public static final String OS = "IOS";

  public IPhone(){
  }

  public IPhone(String brand, String color, int storage, double price) {
    super(brand, color, storage, price);
  }

  @Override
  public void call() {
    System.out.println("Iphone calls");
  }

  @Override
  public void ring() {
    System.out.println("Iphone rings");
  }

  @Override
  public void text() {
    System.out.println("Iphone texts");
  }

  @Override
  public boolean isConvertible() {
    return true;
  }


  @Override
  public void takesPhoto() {
    System.out.println("Iphone takes photos");
  }

  @Override
  public void connectBlueTooth() {
    System.out.println("Iphone implements bluetooth");
  }
}
