public class Person {
  private String name; // private = restricted access
  private int age;

  // Getter
  public String getNameAge() {
   return name+age;
  }

  // Setter
  public void setName(String newName, int ag) {
    this.name = newName;
	this.age = ag;
  }
}

