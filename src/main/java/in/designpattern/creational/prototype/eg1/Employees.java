package in.designpattern.creational.prototype.eg1;

import java.util.ArrayList;
import java.util.List;

/**
 * simulates retrieving list of employees from the database.
 */
public class Employees implements Cloneable{
    private List<Employee> employeeList = null;

    public Employees(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> displayAllEmployees()
    {
        return this.employeeList;
    }

    @Override
    public Object clone() {
        List<Employee> emps = new ArrayList<>();
        for (Employee emp: employeeList) {
            emps.add(emp);
        }

        return new Employees(emps);
    }
}

