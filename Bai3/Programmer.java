public class Programmer extends NhanVien{
    public Programmer(
            String fullname, String address, float salary,
            String chucDanh, float bonus, String performance
    ) {
        super(fullname, address, salary, chucDanh, bonus, performance);
    }


    @Override
    public void tinhThuong() {
        System.out.println("Programmer's Bonus: $"+bonus);
    }

    @Override
    public void baoCaoHieuSuat() {
        System.out.println("Performance report for Programmer " + fullname + ": " + performance);
    }

    @Override
    public void quanLyDuAn() {
        System.out.println("Programmer " + fullname + " is debugging code in Python");
    }
}
