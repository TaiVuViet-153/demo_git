package oop.TinhLuongNhanVien;

public class ProductionEmployee extends Employees {
    // Constructor
    public ProductionEmployee(String name, int id, double workTime) {
        super(name, id, workTime);
    }

    @Override
    public double getPayroll() {
        return getWorkTime() * 2000;
    }
}
