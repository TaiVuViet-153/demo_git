package org.example;

public class Chuoi {
    public static  void main(String[] args) {
        // String trong Java
        String greet = "Hello CyberSoft";
        System.out.println(greet.length());

        // Chuyển đổi chữ In hoa - In thường
        System.out.println(greet.toUpperCase()); // In hoa
        System.out.println(greet.toLowerCase()); // In thường

        // Nối chuyển
        System.out.println("Lời chào " + greet);
        System.out.println("Lời chào ".concat(greet));
    }
}
