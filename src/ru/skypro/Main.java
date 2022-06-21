package ru.skypro;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void completionEmployees(){
        employees[0] = new Employee("Иванов Иван Андреевич", 2, 100000);
        employees[1] = new Employee("Лобанов Артем Сергеевич", 1, 34000);
        employees[2] = new Employee("Денисенко Владислав Юрьевич", 4, 58000);
        employees[3] = new Employee("Тодорашко Валерия Сергеевна", 3, 97000);
        employees[4] = new Employee("Смирнов Дмитрий Дмитреевич", 5, 64000);
        employees[5] = new Employee("Пальчиков Александр Валерьевич", 5, 88000);
        employees[6] = new Employee("Никитина Анна Ильинична", 2, 300000);
        employees[7] = new Employee("Ушакова Нина Генадьевна", 1, 45000);
        employees[8] = new Employee("Кутилина Елена Анатольевна", 1, 120000);
        employees[9] = new Employee("Щербакова Анастасия Даниловна", 3, 95000);
    }
    private static void calculateSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат за месяц = " + sum);
    }

    private static void showEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static void findMinSalary() {
        int min = employees[0].getSalary();
        String name = employees[0].getStaff();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                name = employees[i].getStaff();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в размере " + min + " рублей " + " - " + name);
    }

    private static void findMaxSalary() {
        int max = employees[0].getSalary();
        String name = employees[0].getStaff();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                name = employees[i].getStaff();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в размере " + max + " рублей " + " - " + name);
    }

    private static void findMiddleSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        sum /= employees.length;
        System.out.println("Среднняя сумма затрат в месяц = " + sum);
    }

    private static void showStaff() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getStaff());
        }
    }

    public static void main(String[] args) {
        completionEmployees();
        showEmployees();
        calculateSalary();
        findMiddleSalary();
        findMinSalary();
        findMaxSalary();
        showStaff();

    }
}
