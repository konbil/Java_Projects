public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    //myObj.setName("John"); // Set the value of the name variable to "John"
	myObj.setName("John",17);
    System.out.println(myObj.getNameAge());
  }
}
