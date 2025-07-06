package oop.TinhLuongNhanVien;

public abstract class Employees {
    private String name;
    private int id;
    private double workTime;

    public Employees(String name, int id, double workTime) {
        this.name = name;
        this.id = id;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void displayInfo() {
        System.out.println("Nhân viên " + getName() + "; id: " + getId() + "; Tổng lương: " + getPayroll());
    }

    public abstract double getPayroll();
}
