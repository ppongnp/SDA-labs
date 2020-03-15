package lab6Code.Adapter;

import lect6Code.adapter.Duck;

public class AdapterDemo {
    public static void main(String[] args) {
        Records records = new Records();
        RecordAdapter database = new RecordAdapter(records);

        Employee a = new Employee("testA","thisA",1,1500.0);
        Employee b = new Employee("testB","thisB",2,1500.0);
        Employee c = new Employee("testC","thisC",3,1500.0);

        database.addEmployee(a);
        database.addEmployee(b);
        database.addEmployee(c);

        database.listAllEmployees();
        database.deleteEmployee(2);
        database.listAllEmployees();

    }
}
