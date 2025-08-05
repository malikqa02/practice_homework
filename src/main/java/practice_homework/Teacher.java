package practice_homework;

public class Teacher {
    String name;
    String subject;
    public Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }
    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }
    void setName(String newName){
        this.name = newName;
    }
    void setSubject(String newSubject){
        this.subject = newSubject;
    }
    void printInfo(){
        System.out.println("Учитель - " + getName() + ", Предмет - " + getSubject());
    }
}
