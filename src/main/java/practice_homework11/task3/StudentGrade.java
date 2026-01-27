package practice_homework11.task3;

public class StudentGrade<T extends Number> {
    String studentName;
    String objectName;
    T grade;

    public String getStudentName() {
        return studentName;
    }

    public T getGrade() {
        return grade;
    }

    public String getObjectName() {
        return objectName;
    }

    public StudentGrade(String studentName, String objectName, T grade) {
        this.studentName = studentName;
        this.objectName = objectName;
        this.grade = grade;
    }
}
