package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        // Câu lệnh if
        if (9 > 2) {
            System.out.println("Điều kiện đúng 1");
        }

        if (2 > 9) {
            System.out.println("Điều kiện đúng 2");
        }

        // Viết chương trình kiềm tra xem hôm nay có phải ngày đi học không ?
        int day = 4;
        if (day == 4 || day == 8) {
            System.out.println("hôm nay đi học");
        }

        // Câu if...else
        int a = 8;
        int b = 10;
        if (a > b) {
            System.out.println("Số a lớn hơn số b");
        } else {
            System.out.println("Số b lớn hơn số a");
        }

        // Yêu cầu: Viết chương trình cho phép người dùng nhập vào số tuổi,
        // Kiểm tra xem đã đủ tuổi học đại học chưa (>18t)
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hãy nhập tuổi: ");
//        int age = scanner.nextInt();

//        if (age > 18) {
//            System.out.println("Bạn đã đủ tuổi học đại học !!!");
//        } else {
//            System.out.println("Bạn chưa đủ tuổi học đại học !!!");
//        }

        // Toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 : thực hiện logic 2
//        String result = (age > 18) ? "Bạn đủ tuổi học đại học" : "Bạn chưa đủ tuổi học đại học";
//        System.out.println(result);
//
//        // if...else if....else
//        int c = 10;
//        if (c == 10) {
//            System.out.println("Số 10");
//        } else if (c == 11){
//            System.out.println("Số 11");
//        } else if (c == 12) {
//            System.out.println("Số 12");
//        } else {
//            System.out.println("Vui lòng nhập lại số");
//        }

        // Viết chương trình kiểm tra học sinh, cho phép nhập điểm Toán, Lý, Hoá từ bàn phím
        // Tính điểm trung bình và phân loại học sinh
        // Điểm trung bình <5 : học sinh yếu
        // Điểm trung bình 5.1 - 6: học sinh trung bình
        // Điểm trung bình 6.1 - 7: học sinh khá
        // Điểm trung bình 7.1 - 8: học sinh giỏi
        // Điểm trung bình 8.1 - 10: học sinh xuất sắc
        System.out.println("Hãy nhập điểm môn Toán: ");
        float mathScore = scanner.nextFloat();
        System.out.println("Hãy nhập điểm môn Lý: ");
        float physicScore = scanner.nextFloat();
        System.out.println("Hãy nhập điểm môn Hoá: ");
        float chemistryScore = scanner.nextFloat();

        if ((mathScore > 10) || (physicScore > 10) || (chemistryScore > 10)
                || (mathScore < 0) || (physicScore < 0) || (chemistryScore < 0)) {
            System.out.println("Có điểm môn học không hợp lệ. Vui lòng nhập lại điểm. ");
        } else {
            float averageScore = (mathScore + physicScore + chemistryScore) / 3;
            System.out.println("Điểm trung bình là: " + averageScore);

            if ((0 <= averageScore) && (averageScore < 5)) {
                System.out.println("Học sinh yếu");
            } else if (averageScore <= 6) {
                System.out.println("Học sinh trung bình");
            } else if (averageScore <= 7) {
                System.out.println("Học sinh khá");
            } else if (averageScore <= 8) {
                System.out.println("Học sinh giỏi");
            } else if (averageScore <= 10) {
                System.out.println("Học sinh xuất sắc");
            } else {
                System.out.println("Điểm trung bình không hợp lệ. Vui lòng nhập lại điểm.");
            }
        }

        // switch case
        // swith (giá trị cần so sánh) {
        //      case giá trị so sánh 1
        //          thực hiện logic 1
        //          break;
        //      ,,,,
        //      case giá trị so sánh n
        //          thực hiện logic n
        //          break;
        //      default:
        //          thực hiện logic mặc định
        //          break;
        // }

        int d = 15;
        switch (d) {
            case 5:
                System.out.println("Số 5");
                break;
            case 10:
                System.out.println("Số 10");
                break;
            default:
                System.out.println("Vui lòng kiểm tra lại");
        }
        // Lưu ý: nên switch case với trường hợp giá so sánh là giá trị cụ thể, điều kiện đơn giản (so sánh ==)

    }
}
