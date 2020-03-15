/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6Code.Adapter;
import java.util.Vector;

/**
 *
 * @author boonjv
 */
public class Database {

    private Vector<Employee> employees; //Stores the employees

    public Database() {
        employees = new Vector();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        for(Employee e:employees){
            if (e.getEmpNum() == emp_num){
                employees.remove(e);
                break;
            }
        }
    }
    public  boolean isEmployee(long emp_num) {
        for(Employee e:employees){
            if (e.getEmpNum() == emp_num){
                return true;
            }
        }
        return false;
    }

    public void listAllEmployee(){
        for (Employee e:employees){
            System.out.println(e.toString());
        }
    }

}
