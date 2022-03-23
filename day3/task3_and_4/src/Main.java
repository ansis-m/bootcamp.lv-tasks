public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(10.76); //constructor with double input
        BankAccount otherAccount = new BankAccount(); //default constructor
        myAccount.printBalance();
        myAccount.deposit(100.34); //deposit
        myAccount.printBalance();
        myAccount.withdraw(200); // withdraw more than available
        myAccount.withdraw(20); //working withdraw
        myAccount.printBalance();
        myAccount.deposit(10000); //deposit more than allowed

        myAccount.transfer(17.67, otherAccount); //normal transfer
        myAccount.printBalance();
        otherAccount.printBalance();

        myAccount.transfer(200, otherAccount); //transfer more than available


    }
}