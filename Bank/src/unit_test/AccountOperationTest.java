package unit_test;

import bank.AccountOperation;
import bank.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountOperationTest {

    private static User user;

    @BeforeEach
    void setUserBeforeEach(){
        user = new User("1111", "qwe",
                BigDecimal.valueOf(1000.33), false);
    }

    @Test
    void testGetAccountBalance(){
        assertEquals(BigDecimal.valueOf(1000.33), AccountOperation.getAccountBalance(user));
    }

    @Test
    void testPaymentInForCorrectValues(){
        AccountOperation.setPaymentIn(user, BigDecimal.valueOf(200.33));
        assertEquals(BigDecimal.valueOf(1200.66), user.getAccount());
    }


    @Test
    void testPaymentInForIncorrectValues(){
        assertEquals(null, AccountOperation.setPaymentIn(user, BigDecimal.valueOf(0)));
        assertEquals(null, AccountOperation.setPaymentIn(user, BigDecimal.valueOf(0.00)));
        assertEquals(null, AccountOperation.setPaymentIn(user, BigDecimal.valueOf(-1)));
        assertEquals(null, AccountOperation.setPaymentIn(user, BigDecimal.valueOf(-1.234)));
    }

    @Test
    void testPaymentOutForCorrectValues(){
        AccountOperation.setPaymentOut(user, BigDecimal.valueOf(200.22));
        assertEquals(BigDecimal.valueOf(800.11), user.getAccount());
    }

    @Test
    void testPaymentOutForIncorrectValues(){
        assertEquals(null, AccountOperation.setPaymentOut(user, BigDecimal.valueOf(0)));
        assertEquals(null, AccountOperation.setPaymentOut(user, BigDecimal.valueOf(0.00)));
        assertEquals(null, AccountOperation.setPaymentOut(user, BigDecimal.valueOf(-1)));
        assertEquals(null, AccountOperation.setPaymentOut(user, BigDecimal.valueOf(-1.234)));
    }

}