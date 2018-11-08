package devlab;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class LoginTest {

    @Test
    public void ecryptPass() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        String  pass = encoder.encode("sa");
        System.out.println(pass);
    }
}
