public class Manager extends NhanVien{


    public Manager(
            String fullname, String address, float salary,
            String chucDanh, float bonus, String performance
    )
    {
        super(fullname, address, salary, chucDanh, bonus, performance);
    }

    @Override
    public void tinhThuong() {
        System.out.println("Manager's Bonus: $"+bonus);
    }

    @Override
    public void baoCaoHieuSuat() {
        System.out.println("Performance report for Manager " + fullname + ": " + performance);
    }

    @Override
    public void quanLyDuAn() {
        System.out.println("Manager " + fullname + " is managing a project.");
    }
}
