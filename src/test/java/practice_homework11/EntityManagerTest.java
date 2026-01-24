package practice_homework11;

import org.junit.jupiter.api.Test;
import practice_homework11.task1.EntityManager;
import practice_homework11.task1.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 *Тест Кейсы
 * добавление элементов:
 *    добавить 1 элемент в пустой менеджер
 *    добавить 1 элемент в непустой менеджер
 *    добавить 1 элемент несколькими потоками (проверка интеграции)
 *
 *
 */

public class EntityManagerTest {
    @Test
    public void addEntityTest(){
        EntityManager<Student> manager = new EntityManager<>();

        int initialSize = manager.getAll().size();

        Student expectedStudent = new Student("Коля", true, 17);
        Student expectedStudentNew = new Student("Коля", true, 17); //создали, потому что тест который проверяет equals (читать там)
        manager.add(expectedStudent);
        /**
         * добавить 1 элемент
         * ожидание 1: он содержится в финальном списке
         * ожидание 2: то что было добавлено равно тому что передали
         * ожидание 3: добавлен 1 элемент
         */
        //ожидание 1
        assertTrue(manager.getAll().contains(expectedStudent));
        //ожидание 2
        Student actualStudent = manager.getAll().get(0);
        //сравнение как объект
        assertEquals(expectedStudentNew, actualStudent); //тут мы не знаем был ли переопределен equals. Тестируем что разработчик переопределил equals корректно и вернется true
        //сверяем именно с expectedStudentNew, потому что только так можно проверить то, переопределили ли equals, ведь если использовать просто expectedStudent то это будет один и тот же объект и так не протестим то что хотим протестить
        //сравнение по полям. если все поля равны, это не значит что equals переопределен у студентов. поэтому есть проверка которая выше - проверяющая корректность и в целом наличие переопределения equals
        assertEquals(expectedStudent.getAge(), actualStudent.getAge()); // через ==
        assertEquals(expectedStudent.getName(), actualStudent.getName()); // через equals
        assertEquals(expectedStudent.isActive(), actualStudent.isActive()); // через ==
        //ожидание 3
        assertEquals(initialSize + 1, manager.getAll().size());


    }
}
