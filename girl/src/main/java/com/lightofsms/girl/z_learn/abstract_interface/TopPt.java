package com.lightofsms.girl.z_learn.abstract_interface;

public class TopPt extends Employee implements Hobby {
    @Override
    void setBonus() {
        bonus = getSalary() * 10 / 100;
    }

    public TopPt(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
        setBonus();
    }

    @Override
    public String toString() {
        return "TopPt{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    public TopPt() {
    }


    @Override
    public void playBall() {
        System.out.println("can play ball");
    }

    @Override
    public void game() {

    }
}
