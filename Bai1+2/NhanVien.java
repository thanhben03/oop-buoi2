public class NhanVien {
    int salary;

    public NhanVien(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an employee!");
    }

    public void getSalary() {
        System.out.println("Employee salary: " + salary);

    }
}
