package test.creational.builder;

public class Employee {
    String name;
    int age;
    short sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.sex = employeeBuilder.sex;
    }

    public static class EmployeeBuilder {
        String name;
        int age;
        short sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getSex() {
            return sex;
        }

        public void setSex(short sex) {
            this.sex = sex;
        }

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder sex(short name) {
            this.sex = sex;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
