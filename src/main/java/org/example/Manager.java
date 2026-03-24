package org.example;

class Manager extends Employee {
    int teamSize;

    Manager(String name, String position, int baseSalary, int teamSize) {
        super(name, position, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    double calculateBonus() {
        return teamSize * 500;
    }

    @Override
    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Базовая зарплата: " + baseSalary);
        System.out.println("Размер команды: " + teamSize);
        System.out.println("Бонус: " + calculateBonus());
        System.out.println();
        System.out.println("------------------------");
    }
}