package unit_test;

import bank.User;
import bank.UserAuthentication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class UserAuthenticationTest {

    private User user;

    @BeforeEach
    void setUserBeforeEach(){
        user = new User("111", "qwe",
                BigDecimal.valueOf(1000.33), false);
    }

    @Test
    void testLogUserCorrectValues(){
        UserAuthentication.logStatusUser(user, "111", "qwe");
        Assertions.assertTrue(user.getLogStatus());
    }

    @Test
    void testLogUserIncorrectPassword(){
        UserAuthentication.logStatusUser(user, "111", "qwz");
        Assertions.assertFalse(user.getLogStatus());
    }

    @Test
    void testLogUserIncorrectLogin(){
        UserAuthentication.logStatusUser(user, "121", "qwe");
        Assertions.assertFalse(user.getLogStatus());
    }
}