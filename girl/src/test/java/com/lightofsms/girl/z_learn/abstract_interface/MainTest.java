package com.lightofsms.girl.z_learn.abstract_interface;

import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
//        创建一个员工
        Employee ee;
//        创建一个vip员工
        new TopVip("yang", "shisheng", 100);
//        pt员工
        ee = new TopPt("yang", "xingxing", 100);
//        输出基本信息:
        System.out.println("输出基本信息" + ee);
        Hobby hobby = (Hobby) ee;
//输出爱好信息
        hobby.game();
        hobby.playBall();
    }

}