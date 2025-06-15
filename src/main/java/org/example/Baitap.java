package org.example;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        // Viết chương trình nhập vào thông tin tiêu thụ điện (Tên, số Kw)
        // Tính và xuất tiền trả theo quy tắc
        // 50kw đầu: 500đ/kw
        // 50kw kế: 650đ/kw
        // 100kw kế: 850đ/kw
        // 150kw kế: 1100đ/kw
        // Còn lại: 1300đ/kw

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Hãy nhập số điện đã tiêu thụ trong tháng: ");
        int kw = scanner.nextInt();

        int pay = 0;
        if (0 > kw && kw <= 50) {
            pay = kw * 500;
        } else if (kw <=100) {
            pay = 50*500 + ((kw - 50)*650);
        } else if (kw <= 200) {
            pay = 50*500 + 50*650 + ((kw-100)*850);
        } else if (kw <= 350) {
            pay = 50*500 + 50*650 + 100*850 + ((kw-200)*1100);
        } else if (kw > 350) {
            pay = 50*500 + 50*650 + 100*850 + 150*1100 + ((kw-350)*1300);
        } else {
            System.out.println("Vui lòng nhập số điện tiêu thụ hợp lệ !");
        }

        System.out.println("Khách hàng "+name+" phải chi trả "+pay+" đồng cho hoá đơn tiêu thụ "+kw+"kw điện.");
    }
}
