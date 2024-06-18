public class NhanVien {
    String fullname;
    String address;
    float salary;
    float bonus;
    String chucDanh;
    String performance;

    public NhanVien(String fullname, String address, float salary, String chucDanh, float bonus, String performance) {
        this.fullname = fullname;
        this.address = address;
        this.salary = salary;
        this.chucDanh = chucDanh;
        this.bonus = bonus;
        this.performance = performance;
    }

    public void tinhThuong() {}
    public void baoCaoHieuSuat() {}
    public void quanLyDuAn() {}
}
