
import java.time.LocalDate;


public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate birthDate;

    public Person(String FirstName, String LastName, LocalDate birthDate) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}