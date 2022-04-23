package abstraction.abstract_classes;

public interface BlueTooth {

  void connectBlueTooth();


  //static method
  public static int getYear(){
    return 2022;
  }

  //defoult method non static method that has body
   default boolean isConnected(){
    return true;
  }







}
