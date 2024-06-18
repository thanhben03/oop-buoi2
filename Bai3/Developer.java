public class Developer extends NhanVien{

    public Developer(
            String fullname, String address, float salary,
            String chucDanh, float bonus, String performance)
    {
        super(fullname, address, salary, chucDanh, bonus, performance);
    }

    @Override
    public void tinhThuong() {
        System.out.println("Developer's Bonus: $"+bonus);
    }

    @Override
    public void baoCaoHieuSuat() {
        System.out.println("Performance report for Developer " + fullname + ": " + performance);
    }

    @Override
    public void quanLyDuAn() {
        System.out.println("Developer " + fullname + " is writing code in Java");
    }
}
