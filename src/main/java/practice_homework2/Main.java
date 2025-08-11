package practice_homework2;
import practice_homework2.LibraryTest;


public class Main {
    public static void main(String[] args) {
        // company
        Company emp1 = new Company(1, "Victor");
        Company emp2 = new Company(2, "Alex");
        Company.companyName = "OOO IQM";
        Company emp3 = new Company(3, "Vasiliy");
        Company.printCompanyName();
        //emp1.employeeID = 12; - java: cannot assign a value to final variable employeeID
        //math constants
        System.out.println(MathConstants.calculateCircleArea(10));
        System.out.println(MathConstants.calculateCircumference(5));
        //library - LibraryTest
        //university
        University stud1 = new University(1, "malik");
        stud1.printStudentInfo();
        University.changeUniversityName("MSU");
        University stud2 = new University(2, "tupac shakur");
        University stud3 = new University(3, "donald trump");
        stud2.printStudentInfo();
        stud3.printStudentInfo();
        //game
        GameSettings game1 = new GameSettings(50, "Тетрис");
        GameSettings game2 = new GameSettings(199, "gta");
        GameSettings.setMaxPlayers(2);
        game1.addPlayers();
        game1.addPlayers();
        game1.addPlayers();
        game2.addPlayers();
        game2.addPlayers();
        game2.addPlayers();
        game1.printGameStatus();
        game2.printGameStatus();
        //person
        Person vasya = new Person("Василий", "Петров", "123-451-56-41");
        Person kolya = new Person("Николай", "Иванов", "243-411-51-16");
        Person anya = new Person("Анна", "Степанова", "313-411-51-16");
        vasya.printPersonInfo();
        kolya.printPersonInfo();
        anya.printPersonInfo();
        kolya.setFirstName("Евгений");
        kolya.printPersonInfo();
    }

}
