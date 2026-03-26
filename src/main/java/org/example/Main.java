package org.example;

public class Main {

    public static void createAndDisplayEmployees() {
        System.out.println(" Информация о всех сотрудниках \n");

        Employee emp = new Employee("Илья Егоров", "Сотрудник", 999990000);
        emp.displayInfo();

        Developer dev = new Developer("Алексей Иванов", "Разработчик", 80000, "Java");
        dev.displayInfo();

        Manager man = new Manager("Мария Сидорова", "Менеджер", 70000, 5);
        man.displayInfo();
    }

    public static void main(String[] args) {
        createAndDisplayEmployees();
    }
}