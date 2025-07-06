package oop;
// Tính đóng gói
public class User {
    // Thuộc tính
    private String name;
    private int age;
    private String soDT;

    // Constructor dùng để khởi tạo name, age, soDT (các thuộc tính của Object)
    public User (String name, int age, String soDT) {
        // Con trỏ this sẽ đại diện cho đối tượng User và trỏ tới thuộc tính name
        // được gán trị là giá trị name do người dùng truyền vào.
        this.name = name;
        this.age = age;
        this.soDT = soDT;
    }

    // Phương thức
    // getter và setter
    // tạo phương thức public để lấy giá trị (Getter)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String soDT() {
        return soDT;
    }

    // Tạo phương thức để update giá trị (Setter)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    // Tạo phương thức để hiển thị thông tin người dùng
    public void displayInfo() {
        System.out.println("Username: " + name + "; Age: " + age + "; Phone number: " + soDT);
    }

    public void welcomeMessage() {
        System.out.println("Welcome, " + name + " Thanks for being a user.");
    }
}
