package org.example;

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, String position, int baseSalary, String programmingLanguage) {
        super(name, position, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus() {
        return baseSalary * 0.10;
    }

    @Override
    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Базовая зарплата: " + baseSalary);
        System.out.println("Язык программирования: " + programmingLanguage);
        System.out.println("Бонус: " + calculateBonus());
        System.out.println();
        System.out.println("------------------------");
    }
}