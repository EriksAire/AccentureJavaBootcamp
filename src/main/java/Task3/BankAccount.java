package Task3;

public class BankAccount {
    double balance;

    BankAccount(){
    }

    BankAccount(double balance){
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
        transferTo.deposit(amount);
    }
}
