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
}