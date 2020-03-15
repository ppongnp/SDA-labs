package lab6Code.Adapter;

public class RecordAdapter extends Database {
    private Records rec;

    public RecordAdapter(Records r){
        this.rec = r;
    }

    @Override
    public void addEmployee(Employee employee) {
        super.addEmployee(employee);
        rec.insert(employee);
    }

    @Override
    public void deleteEmployee(long emp_num) {
        super.deleteEmployee(emp_num);
        rec.remove(emp_num);
    }

    public boolean isEmployee(long emp_num) {
        boolean inRec = rec.isEmployee(emp_num);
        boolean inDb = super.isEmployee(emp_num);
        return inRec && inDb;
    }

    public void listAllEmployees(){
        System.out.println("From Records:");
        rec.listAllEmployee();
        System.out.println("From Database:");
        super.listAllEmployee();
    }
}
