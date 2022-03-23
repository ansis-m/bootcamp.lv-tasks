import org.jetbrains.annotations.NotNull;

public class BankAccount {

//    * method for transfer balance from one bank account to another
    double balance;

    BankAccount(){
        this.balance = 0;
    }

    BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount >= 0d)
            balance += amount;
        else
            System.out.println("cannot deposit negative amount");
    }

    public void withdraw(double amount){
        if(amount >= 0d)
            balance -= amount;
        else
            System.out.println("cannot withdraw negative amount");
    }

    public void printBalance(){
        System.out.println("The current balance is " + balance);
    }

    public void transfer(double amount, @NotNull BankAccount account){

        this.balance -= amount;
        account.deposit(amount);
    }

    public static void main(String[] args) {
	    System.out.println("in progress");
    }


}
