package practice_homework6.exceptions.task3;

public class User {
    private int age;

    public User (int age) throws ageException {
        if (age <= 0 || age > 150) {
            throw new ageException("некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void setAge(int age) throws ageException {
        if (age <= 0 || age > 150) {
            throw new ageException("некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }


}
