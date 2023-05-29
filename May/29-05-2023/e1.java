import java.util.ArrayList;
import java.util.Scanner;

public class e1 {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
    int choice;
        do{
        System.out.println("1. Create new accounts\n2. Depoist\n3.Withdraw\n4.Transfer\n5.View Account\n6.Exit");
        choice = scanner.nextInt();
        switch(choice)
        {
            
        }
    }while(true);
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
