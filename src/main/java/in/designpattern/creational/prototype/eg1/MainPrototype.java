package in.designpattern.creational.prototype.eg1;

import java.util.Arrays;

public class MainPrototype {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saurav", "001", "patna", "12345");
        Employee emp2 = new Employee("Saurav2", "002", "patna2", "123456");

        Employees employees = new Employees(Arrays.asList(emp1, emp2));

        System.out.println("Display all employees : " + employees.displayAllEmployees());

        Employees employeesClone = (Employees) employees.clone(); // this is deep copy

        for(Employee emp: employeesClone.displayAllEmployees()) {
            System.out.println("Employee created using Prototype DP with Employee details as - EmpName : " + emp.name());
        }

    }
}
