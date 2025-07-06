package oop.TinhLaiSuat;

public class DebitAccount extends Account {
    public DebitAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }


    // Override lại hàm tính lãi suất
    @Override
    public double interestRate() {
        // Tài khoản thanh toán không có lãi suất
        return 0;
    }
}
