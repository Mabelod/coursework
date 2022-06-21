package ru.skypro;

public class Main {
    private static Employee[] employees = new Employee[10];
    private static int numberDepartment = 4;
    private static double indexingDepartmentStaff = 0.08;
    private static int amountToSearchFor = 53000;

    private static void completionEmployees() {
        employees[0] = new Employee("Иванов Иван Андреевич", 2, 100000);
        employees[1] = new Employee("Лобанов Артем Сергеевич", 1, 34000);
        employees[2] = new Employee("Денисенко Владислав Юрьевич", 4, 58000);
        employees[3] = new Employee("Тодорашко Валерия Сергеевна", 3, 97000);
        employees[4] = new Employee("Смирнов Дмитрий Дмитреевич", 5, 64000);
        employees[5] = new Employee("Пальчиков Александр Валерьевич", 5, 53000);
        employees[6] = new Employee("Никитина Анна Ильинична", 4, 300000);
        employees[7] = new Employee("Ушакова Нина Генадьевна", 1, 45000);
        employees[8] = new Employee("Кутилина Елена Анатольевна", 1, 120000);
        employees[9] = new Employee("Щербакова Анастасия Даниловна", 4, 95000);
    }

    private static float calculateSalary() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff())
                sum += employees[i].getSalary();
        }
        return sum;
    }

    private static void findMinSalary() {
        int min = Integer.MAX_VALUE;
        String name = " ";
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff()) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    name = employees[i].getStaff();
                }
            } else if (numberDepartment <= 0 || numberDepartment > 5) {
                throw new RuntimeException("Введите корректный номер отдела");
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + numberDepartment + "-м отделе в размере " + min + " рублей " + " - " + name);
    }

    private static void findMaxSalary() {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff()) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    name = employees[i].getStaff();
                }
            } else if (numberDepartment <= 0 || numberDepartment > 5) {
                throw new RuntimeException("Введите корректный номер отдела");
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в " + numberDepartment + "-м отделе в размере " + max + " рублей " + " - " + name);
    }

    private static void findMiddleSalary() {
        float sum;
        int employee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff()) {
                employee++;
            }
        }
        sum = calculateSalary() / employee;
        System.out.println("Среднняя сумма зарплат по " + numberDepartment + "-му отделу = " + sum + " (" + employee + ")");
    }

    private static void showStaffDepartment() {
        int number = 1;
        System.out.println("Сотрудники " + numberDepartment + "-го отдела:");
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff()) {
                System.out.println(number +": ФИО: "+ employees[i].getStaff() + ". Зарплата: "+ employees[i].getSalary() + ". ID: " + employees[i].getId());
                number++;
            }
        }
    }

    private static void increaseSalary() {
        double sum;
        double percent = 0.12;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() * percent;
            employees[i].setSalary(employees[i].getSalary() + (int) sum);
        }
        System.out.println(" --- Произвели индексацию на " + percent + " всех сотрудников ---");
    } // тут я выводил индексацию зарплат всех сотрудников по всем отделам.

    private static void increaseSalaryDepartmentStaff() {
        double sum;
        for (int i = 0; i < employees.length; i++) {
            if (numberDepartment == employees[i].getDepartmentStaff()) {
                sum = employees[i].getSalary() * indexingDepartmentStaff;
                employees[i].setSalary(employees[i].getSalary() + (int) sum);
            }
        }
        System.out.println(" --- Произвели индексацию на " + indexingDepartmentStaff + " всех сотрудников " + numberDepartment + "-го отдела ---");
    }
    private static void salarySearchMin() {
        int number = 1;
        System.out.println("----- Все сотрудники с зарплатой меньше " + amountToSearchFor + " -----");
        for (int i = 0; i < employees.length; i++) {
            if (amountToSearchFor > employees[i].getSalary()) {
                System.out.println(number + ": ФИО сотрудника: " + employees[i].getStaff() + ". Зарплата: " + employees[i].getSalary() + ". ID: " + employees[i].getId());
                number++;
            }
            }
    }
    private static void salarySearchMax() {
        int number = 1;
        System.out.println("----- Все сотрудники с зарплатой большей, либо равной " + amountToSearchFor + " -----");
        for (int i = 0; i < employees.length; i++) {
            if (amountToSearchFor <= employees[i].getSalary()) {
                System.out.println(number + ": ФИО сотрудника: " + employees[i].getStaff() + ". Зарплата: " + employees[i].getSalary() + ". ID: " + employees[i].getId());
                number++;
            }
        }
    }

    public static void main(String[] args) {
        completionEmployees();
        showStaffDepartment();
        System.out.println("Сумма зарплат по " + numberDepartment + "-му отделу в месяц = " + (int) calculateSalary());
        findMiddleSalary();
        findMaxSalary();
        findMinSalary();
        increaseSalaryDepartmentStaff();
        showStaffDepartment();
        System.out.println("Сумма зарплат по " + numberDepartment + "-му отделу в месяц = " + (int) calculateSalary());
        findMiddleSalary();
        findMaxSalary();
        findMinSalary();
        salarySearchMin();
        salarySearchMax();

    }
}
