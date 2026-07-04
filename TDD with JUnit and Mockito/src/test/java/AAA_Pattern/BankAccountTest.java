package AAA_Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    BankAccount account;
    @Before
    public void setUp() {
        account = new BankAccount();
        System.out.println("Setup");
    }
    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown");
    }
    @Test
    public void testDeposit() {
        int amount = 500;
        account.deposit(amount);
        assertEquals(1500, account.getBalance());
    }
    @Test
    public void testWithdraw() {
        int amount = 300;
        account.withdraw(amount);
        assertEquals(700, account.getBalance());
    }
}
