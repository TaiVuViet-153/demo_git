package org.example;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        // Viết chương trình đánh giá học sinh, cho phép nhập điểm toán, lý, hoá từ bàn phím.
        // Tính điểm trung bình và đánh giá học sinh
        // <5: học sinh yếu
        // 5 - 6: học sinh trung bình
        // 6.1 - 7: học sinh khá
        // 7.1 - 8: học sinh giỏi
        // 8.1 - 10: học sinh xuất sắc
        // Lưu ý: tách hàm tính điểm trung bình và hàm xếp loại
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập điểm môn Toán:");
        double mathScore = scanner.nextDouble();
        System.out.println("Hãy nhập điểm môn Lý:");
        double physicScore = scanner.nextDouble();
        System.out.println("Hãy nhập điểm môn Hoá:");
        double chemistryScore = scanner.nextDouble();

        double averageScore = averageScore(mathScore, physicScore, chemistryScore);
        String evaluation = evaluation(averageScore);
        System.out.println(evaluation);
    }

    static double averageScore (double mathScore,double physicScore, double chemistryScore) {
        double averageScore = 0;

        if ((mathScore > 10) || (physicScore > 10) || (chemistryScore > 10)
                || (mathScore < 0) || (physicScore < 0) || (chemistryScore < 0)) {

            averageScore = -1;
        } else {
            averageScore = (mathScore + physicScore + chemistryScore)/3;
        }

        return averageScore;
    }

    static String evaluation (double averageScore) {
        String result = "Điểm trung bình của sinh viên là: " + averageScore;
        if ((0 <= averageScore) && (averageScore < 5)) {
            result += ".Học sinh yếu";
        } else if ((5 <= averageScore) && (averageScore <= 6)) {
            result += ".Học sinh trung bình";
        } else if (6 < averageScore && averageScore <= 7) {
            result += ".Học sinh khá";
        } else if (7 < averageScore && averageScore <= 8) {
            result += ".Học sinh giỏi";
        } else if (8 < averageScore && averageScore <= 10) {
            result += ".Học sinh xuất sắc";
        } else {
            result += ".Điểm không hợp lệ. Vui lòng nhập lại.";
        }

        return result;
    }
}
