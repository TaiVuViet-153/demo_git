package oop;

public class Main {
    public static void main(String[] args) {
        // Tạo ra 1 đối tượng User
        User user = new User("Tài", 18, "312512512");
        user.displayInfo();
        user.welcomeMessage();

        user.setName("Giang");
        user.setAge(27);
        user.displayInfo();

        // Tạo ra 1 đối tượng là admin
        Admin admin = new Admin("An", 20, "4214124125", "ADMIN");
        admin.displayAdminInfo();

        Guest guest = new Guest("Tuyến", 18, "12415161","tuyen@gmail.com");
        guest.displayInfo();
        guest.welcomeMessage();

        // Thực hiện gán giá trị bằng những đối tượng con của BaseUser
        BaseUser user1 = new NormalUser("Linh", 18);
        user1.showMessage();

    }
}
