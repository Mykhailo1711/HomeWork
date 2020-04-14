
public class  Person  {
     private String FirstName;
     private String LastName;
     private int Age;
     public Person(String FirstName, String LastName, int   Age) {
         this.FirstName = FirstName;
         this.LastName = LastName;
         this.Age = Age;
     }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}
