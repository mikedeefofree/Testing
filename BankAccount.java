import java.util.Scanner;

public class BankAccount {
    double balance = 0.00;
    String accountType;
    int accountNumber;

    Scanner scanner = new Scanner(System.in);

    public BankAccount(String accountType, double initialBalance) {
        this.balance = initialBalance;
        this.accountType = accountType;
        //System.out.println("Account Name: "+accountName);
        //System.out.println("Balance: "+balance);
    }

    public void homeScreen() {

        System.out.println("Welcome to the Global Bank");
        System.out.println("---------------------------------------");
        System.out.println("Select an option below: ");
        System.out.println("---------------------------------------");

        System.out.println("A. Account Info");
        System.out.println("B. Get Balance");
        System.out.println("C. Withdrawal");
        System.out.println("D. Deposit");
        System.out.println("E. Exit");
        System.out.println("F. Mystery");
        System.out.println("---------------------------------------");
        System.out.print("Enter your choice: ");
        String menuChoice = scanner.nextLine().toUpperCase();
        //user1.accountInfo();

        switch (menuChoice) {
            case "A":
                System.out.println(" ");
                accountInfo();
                break;
            case "B":
                System.out.println(" ");
                getBalance();
                break;
            case "C":
                withdraw();
                break;
            case "D":
                deposit();
                break;
            case "E":
                exit();
                break;
            case "F":
                virus();
                break;

        }
    }

    public void accountInfo() {

        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Would you like to complete another action?");
        System.out.print("Y/N: ");
        String accountChoice = scanner.nextLine().toUpperCase();

        switch (accountChoice) {
            case "Y":
                System.out.println(" ");
                homeScreen();
                break;

            case "N":
                exit();
                break;

            default:
                System.out.println("Invalid Option");
        }

    }

    public void getBalance() {
        System.out.println("Your account balance is: " + balance);
        System.out.println(" ");
        System.out.println("Would you like to complete another action?");
        System.out.print("Y/N: ");
        String balanceChoice = scanner.nextLine().toUpperCase();

        switch (balanceChoice) {
            case "Y":
                System.out.println(" ");
                homeScreen();
                break;

            case "N":
                exit();
                break;

        }
    }

    public void withdraw() {
        System.out.println("Your account balance is: " + balance);
        System.out.print("How much would you like to withdraw?: ");
        int withdrawalAmount = scanner.nextInt();
        scanner.nextLine(); //idk why or how, but this fixed my code
        balance -= withdrawalAmount;
        System.out.println("Withdrawal of: $" + withdrawalAmount + " successful.");
        System.out.println("Your new account balance is: " + balance);
        System.out.println("---------------------------------------");



        System.out.println("Would you like to complete another action?");
        System.out.print("Y/N: ");
        String homeScreenChoice = scanner.nextLine().toUpperCase();

        switch (homeScreenChoice) {
            case "Y":
                System.out.println(" ");
                homeScreen();
                break;

            case "N":
                exit();
                break;

            default:
                System.out.println("Invalid Option");

        }

    }


    public void deposit() {
        System.out.println("Your account balance is: " + balance);
        System.out.print("How much would you like to deposit?: ");
        int depositAmount = scanner.nextInt();
        scanner.nextLine(); //idk why or how, but this fixed my code
        balance += depositAmount;
        System.out.println("Deposit of: $" + depositAmount + " successful.");
        System.out.println("Your new account balance is: " + balance);
        System.out.println("---------------------------------------");



        System.out.println("Would you like to complete another action?");
        System.out.print("Y/N: ");
        String homeScreenChoice = scanner.nextLine().toUpperCase();

        switch (homeScreenChoice) {
            case "Y":
                System.out.println(" ");
                homeScreen();
                break;

            case "N":
                exit();
                break;

            default:
                System.out.println("Invalid Option");
                homeScreen();
                break;
        }

    }


        public void exit(){
            System.out.println("---------------------------------------");
            System.out.println("Thank you for using Global Banking App");
            System.out.println("Have a great day!");
            System.out.println("---------------------------------------");
        }


        public void virus(){
            for(int i = 0; i < 1000000; i++) {
                System.out.println(i+" VIRUS INITIATING "+ (i * 12));
            }

            System.out.println("    ");
            System.out.println("0100#%*010001 Virus successfully installed and initiated 456#%0101%%$$#");
            System.out.println("    ");

            homeScreen();
        }

}






