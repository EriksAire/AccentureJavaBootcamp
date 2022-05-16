import Task3.BankAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task4Tests {
    private BankAccount bankAccount;

    @Before
    public void setUp(){
        bankAccount=new BankAccount(50);
    }

    @Test
    public void bankAccountConstructorTest() {
        //Arrange
        var expectedResult = 50.0;

        //Act
        var bankAccount = new BankAccount(50);

        //Assert
        Assert.assertNotNull(bankAccount);
        Assert.assertEquals(expectedResult, bankAccount.getBalance(), 0.001);
    }

    @Test
    public void depositTest() {
        //Arrange
        var expectedResult = 100.0;

        //Act
        bankAccount.deposit(50);

        //Assert
        Assert.assertNotNull(bankAccount);
        Assert.assertEquals(expectedResult, bankAccount.getBalance(), 0.001);
    }

    @Test
    public void withdrawTest() {
        //Arrange
        var expectedResult = 0.0;

        //Act
        bankAccount.withdraw(50);

        //Assert
        Assert.assertNotNull(bankAccount);
        Assert.assertEquals(expectedResult, bankAccount.getBalance(), 0.001);
    }


    @Test
    public void transferMoneyTest() {
        //Arrange
        var expectedResult = 0.0;
        var transferDestination = new BankAccount(0);
        var destinationExpectedResult = 50;

        //Act
        bankAccount.transferMoney(50, transferDestination);

        //Assert
        Assert.assertNotNull(bankAccount);
        Assert.assertEquals(expectedResult, bankAccount.getBalance(), 0.001);
        Assert.assertEquals(destinationExpectedResult, transferDestination.getBalance(), 0.001);
    }
}
