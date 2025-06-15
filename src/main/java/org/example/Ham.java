package org.example;

public class Ham {

    // Hàm được định nghĩa ở đây
    // Có 2 loại hàm
    // Hàm không có giá trị trả về (hàm thực hiện logic)
    // static void tenHam() {}

    static void greeting() {
        System.out.println("Hello World");
    }

    // Hàm có giá trị trả về
    // static <kiểu dữ liệu> tenHam() {}
    static double dtb(double diemToan, double diemLy, double diemHoa) {
        double dtb = (diemToan + diemLy + diemHoa)/3;
        return dtb;
    }

    public static void main(String[] args) {
        greeting();

        double diemToan = 7.5;
        double diemLy = 8.2;
        double diemHoa = 9.3;
        double dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println(dtb);

    }
}
