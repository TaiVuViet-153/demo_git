package oop;

// Tính kế thừa, để admin kế thừa lại từ user
public class Admin extends User {
    // thuộc tính riêng của admin
    private String role;

    // Constructor để khởi tạo
    public Admin (String name, int age, String soDT, String role) {
        // Hàm mặc định của Java, sẽ giúp gán giá trị cho các thuộc tính được kế thừa
        super(name, age, soDT);
        this.role = role;
    }

    // tạo phương thức lấy giá trị
    public String getRole() {
        return role;
    }

    // tạo phương thức để update giá trị
    public void setRole(String role) {
        this.role = role;
    }

    public void displayAdminInfo() {
        displayInfo(); // kế thừa phương thức này từ lớp cha (name, age, soDT)
        System.out.println("Role: " + role);
    }
}
