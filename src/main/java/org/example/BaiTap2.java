package org.example;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        // Viết chương trình tính tiền lương, cho phép người dùng nhập vô số ngày làm
        // và số tiền 1 ngày. Biết tổng lương = số ngày làm * số tiền 1 ngày.
        // Lưu ý: tách hàm xử lý
        // Mô hình IPO (Input - Process - Output)
        // input: giá trị từ phía người dùng nhập
        //   - tổng số ngày làm
        //   - số lương 1 ngày
        // process: xử lý logic theo yêu cầu bài tập, dựa trên input
        //   - tongLuong = tổng số ngày làm * số lương 1 ngày
        // output: giá trị đầu ra từ yêu cầu của đề
        //   - sout("....")

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hãy nhập số ngày làm việc:");
//        int workingDay = scanner.nextInt();
//        System.out.println("Hãy nhập thu nhập hàng ngày:");
//        int dailyIncome = scanner.nextInt();
//
//        System.out.println("Tổng lương là: " + tinhLuong(workingDay, dailyIncome) + " đồng.");



    }

    static int tinhLuong (int workingDay, int dailyIncome) {

        int luong = workingDay * dailyIncome;

        return luong;
    }


}
