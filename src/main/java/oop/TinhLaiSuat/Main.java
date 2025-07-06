package oop.TinhLaiSuat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Yêu cầu: xây dựng hệ thống quản lý tài khoản ngân hàng gồm 2 loại tài khoản:
        // 1. Tài khoản tiết kiệm
        // 2. Tài khoản thanh toán.
        // Sử dụng OOP
        Scanner scanner = new Scanner(System.in);

        // Cho phép người dùng nhập tài khoản bằng bàn phím
        System.out.println("Hãy nhập số lượng tài khoản: ");
        int n = scanner.nextInt();

        // accounts = []
        Account[] accounts = new Account[n];

        // Lần lượt nhập thông tin người dùng
        for (int i = 0; i < n; i++) {
            System.out.println("Tài khoản thứ " + (i + 1));
            // Người dùng xác nhận loại tài khoản
            System.out.println("Loại tài khoản: 1 - Tiết kiệm; 2 - Thanh toán");
            int accountType = scanner.nextInt();
            if (accountType < 1 || accountType > 3) {
                System.out.println("Loại tài khoản không hợp lệ:");
                return;
            }

            // Dùng tách nextInt và nextLine kế tiếp ra
            scanner.nextLine();

            // Người dùng nhập số tài khoản
            System.out.println("Số tài khoản: ");
            String acountNumber = scanner.nextLine();

            // Người dùng nhập chủ tài khoản
            System.out.println("Chủ tài khoản: ");
            String acountName = scanner.nextLine();

            // Người dùng nhập số dư
            System.out.println("Số dư: ");
            double balance = scanner.nextDouble();

            if (accountType == 1) {
                System.out.println("Lãi suất (%):");
                double interestRate = scanner.nextDouble()/100;
                accounts[i] = new SavingAccount(acountNumber, acountName, balance, interestRate);
            } else if (accountType == 2) {
                accounts[i] = new DebitAccount(acountNumber, acountName, balance);
            }
        }

        System.out.println("Thông tin tài khoản");
        for (Account account: accounts) {
            account.displayInfo();
        }


    }
}
