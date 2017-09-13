package com.lightofsms.girl.z_learn.abstract_interface;

public class TopVip extends Employee implements Hobby {
    @Override
    void setBonus() {
        bonus = getSalary() * 30 / 100;
    }

    public TopVip(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
        setBonus();
    }

    public TopVip() {

    }

    @Override
    public String toString() {
        return "TopVip{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public void playBall() {
        System.out.println("can play ball");
    }

    @Override
    public void game() {
        System.out.println("can play game");
    }
}
