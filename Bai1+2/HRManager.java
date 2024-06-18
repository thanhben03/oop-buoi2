public class HRManager extends NhanVien{

    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager salary: " + salary);
    }

    public void addEmployee() {
        System.out.println("Adding new employee !");
    }
}
