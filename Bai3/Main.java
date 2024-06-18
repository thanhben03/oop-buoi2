public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Arvil Aroldo", "Quan 1", 10000,
                "manager", 12000.0f, "Excellent"
        );
        Developer developer = new Developer(
                "Iver Dipali", "Quan 2", 20000,
                "developer", 7200.0f, "Good"
        );
        Programmer programmer = new Programmer(
                "Yaron Gabriel", "Quan 3", 40000,
                "developer", 9120.0f, "Excellent"
        );

        manager.tinhThuong();
        developer.tinhThuong();
        programmer.tinhThuong();

        manager.baoCaoHieuSuat();
        developer.baoCaoHieuSuat();
        programmer.baoCaoHieuSuat();

        manager.quanLyDuAn();
        developer.quanLyDuAn();
        programmer.quanLyDuAn();
    }
}
