package practice_homework2;

import practice3.Student;

public class University {
    static String universityName;
    final int studentID;
    String studentName;
    University(int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }
    static void changeUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }
    String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println("Имя - " + studentName + ", id - " + studentID + ", Университет - " + universityName);
    }
}
