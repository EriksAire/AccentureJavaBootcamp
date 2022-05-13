package Task3;

public class BankAccount {

    double balance;

    BankAccount(){
    }

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void transferMoney(double amount, BankAccount transferTo){
        this.withdraw(amount);
        transferTo.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }
}
