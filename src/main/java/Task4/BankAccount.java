package Task4;

public class BankAccount {
    private double balance;
    public double getBalance() {
        return balance;
    }

    BankAccount(){
    }

    BankAccount(double balance){
        this.balance = balance;
    }


    public void deposit(double amount){
        if(amount<5000.0){
            balance+=amount;
        }
        else {
            System.out.printf("Transaction cancelled. Max deposit - 5000 | Your deposit: %f", amount);
        }
    }

    public void withdraw(double amount){
        if (amount<balance){
            balance-=amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void transferMoney(double amount, BankAccount transferTo){
        if(amount < this.balance){
            transferTo.deposit(amount);
        }else{
            System.out.printf("Transfer cancelled. You are trying to transfer %f units, but only %f are available", amount, this.balance);
        }
    }
}
