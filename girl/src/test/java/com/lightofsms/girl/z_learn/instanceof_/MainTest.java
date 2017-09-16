package com.lightofsms.girl.z_learn.instanceof_;

import com.lightofsms.girl.pojo.Girl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {



    public List lists() {
        List<Girl> girls = new ArrayList<>();

        girls.add(new Girl());
        girls.add(new Girl());
        girls.add(new Girl());
        return girls;
    }

    public static void main(String[] args) {


    }

    @Test
    public void test1() {

        System.out.println(lists());

    }


}
