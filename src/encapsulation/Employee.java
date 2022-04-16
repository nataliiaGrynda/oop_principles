package encapsulation;

public class Employee {

  public Employee(){

  }

  //instance variables
  private final static int totalEmployees = 10;//
  /*
  define info below and encapsulate them
   */
  private  String fullName;
  private int age;
  private String address;
  private String phone;

  public static int getTotalEmployees(){
    return totalEmployees;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPhone() {
    return phone;

  }
  @Override
  public String toString() {
    return "Employee{" +
      "fullName='" + fullName + '\'' +
      ", age=" + age +
      ", address='" + address + '\'' +
      ", phone='" + phone + '\'' +
      '}';
  }


}
