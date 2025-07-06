package oop.TinhLuongNhanVien;

public class OfficeEmployees extends Employees {
    // Constructor
    public OfficeEmployees(String name, int id, double workTime) {
        super(name, id, workTime);
    }

    @Override
    public double getPayroll() {
        return getWorkTime() * 5000;
    }
}
