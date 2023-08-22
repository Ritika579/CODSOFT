import java.util.Scanner;
//account class to store the balance of the user
class Account{
    private double balance;
    
     public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }
     public boolean withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
     public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
}

class ATM{
    private Account account;
    private Scanner scanner;

    public ATM(Account account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    //pin verification
    public void checkpin(){
    int Pin = 2456;
    System.out.println("Enter pin number");
    int userpin = scanner.nextInt();
    if(userpin==Pin){
        menu();
    }
    else{
        System.out.println("Wrong pin number");
    }
    checkpin();
}



    //options
    public void menu()
{
    System.out.println("\nWelcome to this ATM.\n");
    System.out.println("Enter your choice");
    System.out.println("Press 1: Withdraw Money.\nPress 2. Deposit Money.\nPress 3. Check balance.\nPress 4. Exit.\n");
    Scanner sc= new Scanner(System.in);
    int ch = sc.nextInt();

    if(ch==1){
        System.out.print("Enter amount: ");
        double amt =sc.nextDouble();
        account.withdrawMoney(amt);
        menu();
    }
    else if(ch==2){
        System.out.print("Enter Amount: " );
        double amt =sc.nextDouble();
        account.depositMoney(amt);
        menu();
    }

    else if( ch==3){
        System.out.print("Your current balance is :  " +account.getBalance());
        menu();
    }
    else if(ch==4){
        System.out.println("Thank you for using this ATM");
        return;
    } 
    else{
        System.out.println("Invalid option!");
    }

}
}
    public class ATMmachine
    {
        public static void main(String[]args){
        Account userAccount = new Account(1000.0);
        ATM obj= new ATM(userAccount);
        obj.checkpin();

    }
}