package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Employee {
    private int id;
    private String name;
    private int age;
    private String deptName;
    private double salary;

    Employee() {}
    Employee(int id, String name, int age, String deptName, double salary ) {
        this.id = id;
        this.name=name;
        this.age=age;
        this.deptName= deptName;
        this.salary=salary;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public Employee setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee getEmployee() {
        return new Employee(id, name, age, deptName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        //Employee emp = new Employee(1001, "Sam");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) context.getBean("empBean");

        // Access the properties of the empBean and print them
        System.out.println("Employee Details:");
        // You can access other properties in a similar manner

        // Alternatively, you can print the entire Employee object using toString method
        System.out.println(emp);

        Employee emp1 = new Employee().setId(1002).setName("Krish").getEmployee();
        System.out.println(emp1);
    }
}
