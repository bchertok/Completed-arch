package SampleOfJunit;

import lombok.Data;

@Data
public class Person {
  private   String firstname;
   private String lastname;

    Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
