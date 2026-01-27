package practice_homework11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice_homework11.task2.InvalidUserException;
import practice_homework11.task2.User;
import practice_homework11.task2.UserValidator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {

    /**
     * happy path:
     * ("Nina", 19, "email@gmail.com") --> true (valid)
     * corner cases:
     * ("Nina", 18, "email@gmail.com") --> true (valid)
     * ("Nina", 100, "email@gmail.com") --> true (valid)
     * ("Nick", 54, "email@as.a.com") --> true (valid)
     * negative:
     * ("nina", 18, "email@gmail.com") --> InvalidUserException
     * ("Nina", 6, "email@gmail.com") --> InvalidUserException
     * ("Nina", 116, "email@gmail.com") --> InvalidUserException
     * ("Nina", 19, "email@") --> InvalidUserException
     * ("Nina", 19, "emailgmail.com") --> InvalidUserException
     */


    public static Stream<Arguments> userData(){
        return Stream.of(
                Arguments.of("Nina", 19, "email@gmail.com"),
                Arguments.of("Nina", 18, "email@gmail.com"),
                Arguments.of("Nina", 100, "email@gmail.com"),
                Arguments.of("Nick", 54, "email@as.a.com"));
    }

    @ParameterizedTest
    @MethodSource("userData")
    public void userCanValidateValidUsersCornerCases(String name, int age, String email) throws InvalidUserException {
        User user1 = new User(name, age, email);
        UserValidator userValidator = new UserValidator(true, user1);
        assertTrue(userValidator.userValidationChecker());
    }

    public static Stream<Arguments> userIncorrectData(){
        return Stream.of(
                Arguments.of("nina", 18, "email@gmail.com"),
                Arguments.of("Nina", 6, "email@gmail.com"),
                Arguments.of("Nina", 116, "email@gmail.com"),
                Arguments.of("Nina", 19, "emailgmail.com"),
                Arguments.of("Nina", 19, "email@"));
    }

    @ParameterizedTest
    @MethodSource("userIncorrectData")
    public void userCanValidateUsersWithIncorrectData(String name, int age, String email){
        assertThrows(InvalidUserException.class, () -> {
            User user1 = new User(name, age, email);
            UserValidator userValidator = new UserValidator(true, user1);
            userValidator.userValidationChecker();
        });
    }
}
