package org.example;

public class mang {
    public static void main(String[] args) {
        //Khởi tạo giá trị
        int[] numbers = {10, 20, 30, 40};
        String[] name = {"Thành", "Tuyến", "Giang"};

        System.out.println(name[1]);
        name[2] = "Khải";
        System.out.println(name[2]);

        //Chiều dài của mảng
        int length = name.length;
        System.out.println("Chiều dài của mảng :" + length);

        //Duyệt mảng dùng lặp for
        for(int i = 0; i < name.length; i++) {
            System.out.println("Tên thứ " + (i+1) + " là: " + name[i]);
        }

        //Duyệt mảng dùng lặp for-each
        for(int number: numbers) { // Cú pháp của foreach
            System.out.println(number);
        }

        //Nâng cao: duyệt mảng ngược
        for(int index = numbers.length - 1; index >= 0; index--) {
            System.out.println(numbers[index]);
        }
    }
}
