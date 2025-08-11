package practice_homework2;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;
    Person(String someFirstName, String someLastName, String someSsn){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getSsn(){
        return ssn;
    }
    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    void setLastName(String newLastName){
        this.lastName = newLastName;
    }
   public void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + ", SSN: " + ssn);
    }
}
