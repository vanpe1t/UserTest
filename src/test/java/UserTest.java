import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    static String email = "user@user.ru";
    static String login = "user";

    @Test
    void shouldCreateUserWithNoEmail() {
        User user = new User();
        Assertions.assertNull(user.getEmail());
    }

    @Test
    void shouldCreateUserWithNoLogin() {
        User user = new User();
        Assertions.assertNull(user.getLogin());
    }
    @Test
    void shouldCreateUserWithFields() {
        User user = new User(email, login);
        Assertions.assertEquals(new User("user@user.ru", "user"), user);
    }

    @Test
    void shouldLoginEmailNotEqual() {
        Assertions.assertThrows(IllegalStateException.class, ()-> new User("email", "email"));
    }

    @Test
    void shouldBeCorrectEmail() {
        Assertions.assertThrows(IllegalStateException.class, ()-> new User("user@userru", login));
    }

}