package oop.TinhLuongNhanVien;

public class Main {
    public static void main(String[] args) {
        // Yêu cầu: Viết chương trình tính lương nhân viên. Biết rằng
        // Nhân viên văn phòng = soGioLam * 5000;
        // Nhân viên sản xuất = soGioLam * 2000;
        // public abstract nhanVien() { // thuoc tinh // phuong thuc in thong tin va abstract tinhluong
        Employees employee1 = new OfficeEmployees("Tài", 1, 100);
        Employees employee2 = new ProductionEmployee("Nhân", 2, 120);

        employee1.displayInfo();
        employee2.displayInfo();
    }
}
