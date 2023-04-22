import java.util.Objects;
public class User {

    private String email;

    private String login;

    public User() {
        this.email = null;
        this.login = null;
    }

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, login);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
