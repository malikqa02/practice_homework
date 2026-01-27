package practice_homework11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_homework11.task3.GradeService;
import practice_homework11.task3.InvalidGradeException;
import practice_homework11.task3.StudentGrade;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    GradeService<Number> gradeService;
    /**
     * позитивные:
     * добавление первой оценки, проверка что все добавилось
     * добавление двух оценок, проверка что все добавилось
     * расчет среднего значения валидных оценок 93.2 и 40 -> 66.6
     * негативные:
     * добавить отрицательную оценку - исключение
     * расчет среднего значения невалидных оценок 93.2 и 410 -> исключение
     */

    @BeforeEach
    public void setUpTest(){
        gradeService = new GradeService<>();
    }

    @Test
    public void userCanAddFirstGrade() {
        StudentGrade<Number> grade1 = new StudentGrade<>("Ivan", "Math", 93.2);
        gradeService.addGrade(grade1);
        int actualSize = gradeService.getAll().size();
        assertEquals(1, actualSize);
        String expectedName = "Ivan";
        String actualName = gradeService.getAll().get(0).getStudentName();
        assertEquals(expectedName, actualName);
        String expectedObject = "Math";
        String actualObject = gradeService.getAll().get(0).getObjectName();
        assertEquals(expectedObject, actualObject);
        Number expectedGrade = 93.2;
        Number actualGrade = gradeService.getAll().get(0).getGrade();
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void userCanAddSecondGrade() {
        StudentGrade<Number> grade1 = new StudentGrade<>("Ivan", "Math", 93.2);
        StudentGrade<Number> grade2 = new StudentGrade<>("Misha", "Eng", 40);
        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);
        int actualSize = gradeService.getAll().size();
        assertEquals(2, actualSize);
        String expectedName1 = "Ivan";
        String actualName1 = gradeService.getAll().get(0).getStudentName();
        assertEquals(expectedName1, actualName1);
        String expectedObject1 = "Math";
        String actualObject1 = gradeService.getAll().get(0).getObjectName();
        assertEquals(expectedObject1, actualObject1);
        Number expectedGrade1 = 93.2;
        Number actualGrade1 = gradeService.getAll().get(0).getGrade();
        assertEquals(expectedGrade1, actualGrade1);
        String expectedName2 = "Misha";
        String actualName2 = gradeService.getAll().get(1).getStudentName();
        assertEquals(expectedName2, actualName2);
        String expectedObject2 = "Eng";
        String actualObject2 = gradeService.getAll().get(1).getObjectName();
        assertEquals(expectedObject2, actualObject2);
        Number expectedGrade2 = 40;
        Number actualGrade2 = gradeService.getAll().get(1).getGrade();
        assertEquals(expectedGrade2, actualGrade2);
    }

    @Test
    public void userCanCalculateAverageGrade() {
        StudentGrade<Number> grade1 = new StudentGrade<>("Ivan", "Math", 93.2);
        StudentGrade<Number> grade2 = new StudentGrade<>("Misha", "Math", 40);
        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);
        Double actualAverageGrade = gradeService.calculateAverageBySubject("Math");
        Double expectedAverageGrade = 66.6;
        assertEquals(expectedAverageGrade, actualAverageGrade);
    }

    @Test
    public void userCanCalculateAverageGradeOfInvalidGrade() {
        assertThrows(InvalidGradeException.class, () -> {
            StudentGrade<Number> grade1 = new StudentGrade<>("Ivan", "Math", 93.2);
            StudentGrade<Number> grade2 = new StudentGrade<>("Misha", "Math", 410);
            gradeService.addGrade(grade1);
            gradeService.addGrade(grade2);
            gradeService.calculateAverageBySubject("Math");
        });
    }


}
