package org.example;

class Employee {
    String name;
    String position;
    int baseSalary;


    Employee(String name, String position, int baseSalary) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    double calculateBonus() {
        return 0;
    }

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Базовая зарплата: " + baseSalary);
        System.out.println("Бонус: " + calculateBonus());
        System.out.println("------------------------");
    }

    static Employee createEmployee() {
        return new Employee("Илья Егоров", "Сотрудник", 999990000);
    }

    static Developer createDeveloper() {
        return new Developer("Алексей Иванов", "Разработчик", 80000, "Java");
    }

    static Manager createManager() {
        return new Manager("Мария Сидорова", "Менеджер", 70000, 5);
    }

    static void runTask() {
        System.out.println(" Информация о всех сотрудниках \n");

        Employee emp = createEmployee();
        emp.displayInfo();

        Developer dev = createDeveloper();
        dev.displayInfo();

        Manager man = createManager();
        man.displayInfo();
    }
}