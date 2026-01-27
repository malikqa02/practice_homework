package practice_homework11.task2;

public class UserValidator {
    User user;
    boolean validationEnabled = false;

    public UserValidator(boolean validationEnabled, User user) {
        this.validationEnabled = validationEnabled;
        this.user = user;
    }

    public boolean userValidationChecker() throws InvalidUserException {
        //добавить еще валдиацию на имя первую заглавную букву и валидацию для почты
        if (validationEnabled) {
            if ((user.getAge() >= 18 && user.getAge() <= 100) && (user.getName() != "") && (Character.isUpperCase(user.getName().charAt(0))) && (user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))) {
                user.setValid(true);
            } else {
                user.setValid(false);
                throw new InvalidUserException("invalidd user");
            }
        } else {
            return false;
        }
        return user.isValid();
    }

}

