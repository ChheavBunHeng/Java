import java.util.ArrayList;
import java.util.Scanner;

class E1 {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Create new account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. View Account\n6. Exit");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    CreateAccount();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    private static void CreateAccount() {
        scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter Initial Balance");
        double balance = scanner.nextDouble();
        int accountNumber = accounts.size()+1;
        Account account = new Account(accountNumber, name, address, balance);
        accounts.add(account);
        Transaction transaction = new Transaction(transactions.size() + 1, "Create Account", accountNumber, balance);
        transactions.add(transaction);
        System.out.println("Account Created Successfully with account number "+ accountNumber);
    }
}

class Account {
    private int accountNumber;
    private String name;
    private String address;
    private double balance;

    public Account(int accountNumber, String name, String address, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAddress() {
        return address; 
    }    

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

class Transaction {
    private int transactionID;
    private String type;
    private int accountNumber;
    private double amount;

    public Transaction(int transactionID, String type, int accountNumber, double amount) {
        this.transactionID = transactionID;
        this.type = type;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int newTransactionID) {
        this.transactionID = newTransactionID;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    } 
}
