package ru.skypro;

public class Employee {
    private String staff;
    private int departmentStaff;
    private int salary;
    private int id;
    private static int counter = 93;

    public Employee(String staff, int departmentStaff, int salary) {
        this.staff = staff;
        this.departmentStaff = departmentStaff;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }
    public int getCounter() {
        return counter;
    }

    public String getStaff() {
        return staff;
    }

    public int getDepartmentStaff() {
        return departmentStaff;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentStaff(int departmentStaff) {
        this.departmentStaff = departmentStaff;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника - " + staff + " Отдел - " + departmentStaff + " Зарплата - " + salary + " ID - " + id;
    }
}
