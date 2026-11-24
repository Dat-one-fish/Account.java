import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void balanceIsCorrect() {
        Account.setBalance(100);
        assertEquals(100, Account.getBalance());
    }

    @Test
    void depositAddsMoney() {
        Account.setBalance(100);
        Account.deposit(50);
        assertEquals(150, Account.getBalance());
    }

    @Test
    void negativeDepositIsIgnored() {
        Account.setBalance(100);
        Account.deposit(-20);
        assertEquals(100, Account.getBalance());
    }

    @Test
    void withdrawTakesMoneyOut() {
        Account.setBalance(100);
        Account.withdraw(40);
        assertEquals(60, Account.getBalance());
    }

    @Test
    void negativeWithdrawIsIgnored() {
        Account.setBalance(100);
        Account.withdraw(-10);
        assertEquals(100, Account.getBalance());
    }
}