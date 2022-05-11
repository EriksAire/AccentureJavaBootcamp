package Task3;

public class main {
    public static void main(String[] args) {
        var source = new BankAccount(100);
        var destination = new BankAccount(0);

        source.deposit(50);
        source.printBalance();

        source.withdraw(50);
        source.printBalance();

        System.out.println("Amount of money before transfer " + destination.balance);
        source.transferMoney(50, destination);
        destination.printBalance();
    }
}
