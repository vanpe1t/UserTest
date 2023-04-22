import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    static String email = "user@user.ru";
    static String login = "user";

    @Test
    void shouldCreateUserWithNoFields() {
        User user = new User();
        Assertions.assertTrue(user.getEmail() == null && user.getLogin() == null);
    }

    @Test
    void shouldCreateUserWithFields() {
        User user = new User(email, login);
        Assertions.assertTrue(user.getEmail() == email && user.getLogin() == login);
    }

    @Test
    void shouldLoginEmailNotEqual() {
        User user = new User(email, login);
        Assertions.assertTrue(user.getEmail() != user.getLogin());
    }

    @Test
    void shouldBeCorrectEmail() {
        User user = new User(email, login);
        Assertions.assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

}