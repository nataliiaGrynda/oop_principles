package inheritance;

public class Tester extends Person{


  public Tester() {

  }

  public Tester(String fName, String lName, int age, String gender){
    super.fName = fName;
   super.lName = lName;
   super.age = age;
   super.gender = gender;
 }


   public void code(){
     System.out.println("Tester code");
   }







}
