public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance = 0;

    Account() {
        System.out.println("constructor called: object created!");
    }

    Account(String accountNo, String accOwner) {
        System.out.println("constructor called: object created!");
        this.accountNumber = accountNo;
        this.ownerName = accOwner;
    }

    Account(String accountNo, String accOwner, double Balance) {
        System.out.println("constructor called: object created!");
        this.accountNumber = accountNo;
        this.ownerName = accOwner;

        if (Balance < 0) {
            System.out.println("Invalid balance! cannot be negative");
            this.balance = 0;
        } else
            this.balance = Balance;

    }

    boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return false;
        }

        balance += amount;
        return true;

    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("cannot withdraw negative amount!");
            return false;
        }
        if (balance < amount) {
            System.out.println("Low funds; cannot withdraw");
            return false;
        }

        balance -= amount;
        return true;
    }

    void setAccNo(String newAccNo) {
        this.accountNumber = newAccNo;
    }

    String getAccNo() {
        System.out.println(accountNumber);
        return accountNumber;
    }

    void setOwnerName(String newName) {
        this.ownerName = newName;
    }

    String getOwnerName() {
        System.out.println(ownerName);
        return ownerName;
    }

    double getBalance() {
        System.out.println(balance);
        return balance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
