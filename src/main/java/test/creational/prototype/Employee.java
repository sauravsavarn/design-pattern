package test.creational.prototype;

public class Employee implements Prototype{
    String name;
    int age;
    String dept;

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Employee(name, age, dept);
    }

    public void display(Employee employee) {
        System.out.println("""
                Employee %s is created using Prototype DP having age %d and dept. is %s
                """.formatted(employee.name, employee.age, employee.dept));
    }
}
