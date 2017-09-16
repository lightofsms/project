package com.lightofsms.girl.z_learn.fanxing;

import lombok.Data;

public class Demo {
    public static void main(String[] args) {
        // 实例化泛型类
//        Point<Integer, Integer> p1 = new Point<Integer, Integer>();
//        p1.setX(10);
//        p1.setY(20);
//        int x = p1.getX();
//        int y = p1.getY();
//        System.out.println("This point is：" + x + ", " + y);
//
//        Point<Double, String> p2 = new Point<Double, String>();
//        p2.setX(25.4);
//        p2.setY("东京180度");
//        double m = p2.getX();
//        String n = p2.getY();
//        System.out.println("This point is：" + m + ", " + n);

        ShenWu shenWu = new ShenWu(1);
    }
}

// 定义泛型类
@Data
class Point<T1, T2> {
    T1 x;
    T2 y;

    public Point(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

}

@Data
class ShenWu<T> {
    T data;

    public ShenWu(T data) {

        System.out.println("not konw");
    }

    public ShenWu() {
    }

    public ShenWu(String s) {
        System.out.println("know");
    }
}