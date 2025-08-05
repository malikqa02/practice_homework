package practice_homework;

public class StudentGroup {
    String groupName;
    int studentCount;
    public StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }
    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }
    void printInfo(){
        System.out.println("В группе " + getGroupName() + " - " + getStudentCount() + " человек");
    }
}
