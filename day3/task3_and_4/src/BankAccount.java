import org.jetbrains.annotations.NotNull;

public class BankAccount {

    private double balance;

    BankAccount(){
        this.balance = 0;
    }

    BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){

        if(amount > 5000){
            System.out.printf("Transaction cancelled. Max deposit - 5000 | Your deposit: %.2f\n", amount);
            return;
        }
        if(amount >= 0d)
            balance += amount;
        else
            System.out.println("cannot deposit negative amount");
    }

    public void withdraw(double amount){
        if(amount >= 0d && balance >= amount)
            balance -= amount;
        else if (amount >= 0d)
            System.out.println("There is not enough funds.");
        else
            System.out.println("cannot withdraw negative amount");
    }

    public void printBalance(){
        System.out.printf("The current balance is %.2f\n", balance);
    }

    public void transfer(double amount, @NotNull BankAccount account){

        if(this.balance < amount){
            System.out.printf("Transfer cancelled. You are trying to transfer %.2f units, but only %.2f are available.", amount, this.balance);
            return;
        }

        this.balance -= amount;
        account.deposit(amount);
    }

}
