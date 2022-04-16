package encapsulation;

public class Car {


  public String make;
  private int year;
private double price;//require a password
  private boolean isConvertible = true;//

  //providing indirect access to year to set and get info
   public void setYear(int year){
     this.year = year;
   }
   public int getYear(){
     return this.year;
  }
//writing setting info
   public void setPrice(double price, String adminPassword){
    if(adminPassword.equals("abcd1234")) this.price = price;
    else throw new RuntimeException("The password entered is nor valid!!!");
   }
   //reading - getting info
   public double getPrice(){
    return price;
}

   public boolean getIsConvertible(){
     return isConvertible;
   }


}
