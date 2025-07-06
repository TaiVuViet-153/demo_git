package oop.TinhLaiSuat;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount (String accountNumber, String accountName, double balance, double interestRate) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }

    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    // Override lại hàm tính lãi suất
    @Override
    public double interestRate() {
        // Tài khoản tiết kiệm thì số dư * lãi suất
        return getBalance() * getInterestRate();
    }
}
