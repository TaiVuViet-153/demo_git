package oop;

// Tính đa hình: khả năng của 1 đối tượng có nhiều hình thái
// Cùng 1 phương thức nhưng có thể có nhiều cách xử lý khác nhau
public class Guest extends User {
    private String email;

    public Guest(String name, int age, String soDT, String email) {
        super(name, age, soDT);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("Email: " + email);
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Welcome Guest " + getName() + " limit feature access");
    }
}
