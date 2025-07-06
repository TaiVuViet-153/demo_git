package oop.TinhLaiSuat;

public abstract class Account {
    // Properties
    private String accountNumber;
    private String accountName;
    private double balance;

    //Constructor
    public Account (String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() { return accountNumber; }

    public String getAccountName() { return accountName; }

    public double getBalance() { return balance; }

    // Setter
    public void setBalance(double balance) { this.balance = balance; }


    // Method:
    // 1. Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Chủ tài khoản: " + getAccountName() +
                           "\nSố tài khoản: " + getAccountNumber() +
                           "\nSố dư: " + getBalance() +
                           "\nTiền lãi: " + interestRate() +
                           "\n----------------------------------------");
    }

    // 2. Rút tiền
    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ.");
        }

        setBalance(getBalance() - amount);
        System.out.println("Số tiền đã rút : " + amount + "\n Số dư còn lại là: " + getBalance());
    }

    // 3. Gửi tiền
    public void depositMoney(double amount) {
        if (amount <= 0 || amount > getBalance()) {
            System.out.println("Số tiền không hợp lệ.");
        }

        setBalance(getBalance() + amount);
        System.out.println("Số tiền đã gửi : " + amount + "\n Số dư còn lại là: " + getBalance());
    }

    // 4. Tính lãi suất
    public abstract double interestRate();
}
