package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // vòng lặp while
        // giá trị ban đầu
        // while (điều kiện thoát) {
        //      thực hiện logic
        //      thay đổi giá trị ban đầu
        // }

        // Yêu cầu: in ra 5 dòng Hello World
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("Hello World");
//            i++; // i = i + 1 hoặc i += 1
//        }
//
//        // Yêu cầu: Viết chương trình cho phép người dùng nhập số n, in ra giao diện n lần dòng hello testing 05
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hãy nhập số lần muốn in: ");
//        int n = scanner.nextInt();
//        i = 1;
//        while (i <= n) {
//            System.out.println("Hello Testing 05");
//            i++;
//        }

        // Vòng lặp do...while
        // giá trị ban đầu
        // do {
        //      thực hiện logic
        //      làm thay đổi giá trị ban đầu
        // } while (điều kiện)
//        int index = 1;
//        do{
//            System.out.println("Giá trị i: " + index);
//            index++;
//        }while(index <= 5);


        // Vòng lặp for
        // for(giá trị khởi tạo; điều kiện; cấp nhật giá trị khởi tạo)
        // {
        //         thực hiện logic
        // }
//        for(int j = 1; j <= 5; j++) {
//            System.out.println("Giá trị j: " + j);
//        }

        Scanner scanner = new Scanner(System.in);
        // Bài Tập 1: viết chương trình cho phép người dùng nhập vào số N.
        // Tính tổng số từ 1 đến N
        System.out.println("Hãy nhập số nguyên n:");
        int n1 = scanner.nextInt();
        int tong1 = 0;
        for (int i = 1; i <= n1; i++) {
            tong1 += i;
        }
        System.out.println("Tổng số từ 1 đến n là: " + tong1);


        // Bài tập 2: viết chương trình cho phép người dùng nhập vào số N.
        // Tính tổng số chẵn từ 0 đến N
        System.out.println("Hãy nhập số nguyên n:");
        int n2 = scanner.nextInt();
        int tong2 = 0;
        for (int i = 0; i <= n2; i += 2) {
            tong2 += i;
        }
        System.out.println("Tổng các số chẵn từ 0 đến n là: " + tong2);

        //Chia hết cho 3 thì for(int i=3; i <= n; i += 3)
    }
}
