package oop;
// Tính trừu tượng là định nghĩa 1 hành vi trong lơp đối tượng chưa hoàn chỉnh
public abstract class BaseUser {
    private String name;
    private int age;

    public BaseUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Định nghĩa ra những phương thức trừu tượng (không có nội dung, yêu cầu lớp con định nghĩa)
    public abstract void showMessage();
}
