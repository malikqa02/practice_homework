package practice_homework11.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade){
        if (grade.getGrade().doubleValue() <= 0 || grade.getGrade().doubleValue() > 100){
            throw new InvalidGradeException("invalidd graвe");
        } else {
            studentGradeList.add(grade);
        }
    }

    public List<StudentGrade<T>> getAll(){
        return List.copyOf(studentGradeList);
    }

    public synchronized double calculateAverageBySubject(String subject){
        return studentGradeList.stream()
                .filter(g -> g.getObjectName().equals(subject))
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElse(0);
    }
}
