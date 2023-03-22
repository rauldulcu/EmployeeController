package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Person {
   private String firstName;
   private String lastName;

    public Person(String firstName) {
        this.lastName = "";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
