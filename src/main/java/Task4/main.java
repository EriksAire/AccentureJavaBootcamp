package Task4;

public class main {
    public static void main(String[] args) {
        var source = new BankAccount(100.0);
        var destination = new BankAccount(0.0);

        source.deposit(4000.0);
        source.printBalance();

        source.withdraw(50.0);
        source.printBalance();

        System.out.println("Amount of money before transfer " + destination.getBalance());
        source.transferMoney(50.0, destination);
        destination.printBalance();
    }
}
