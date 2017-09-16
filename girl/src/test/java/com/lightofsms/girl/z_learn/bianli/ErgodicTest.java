package com.lightofsms.girl.z_learn.bianli;

import com.lightofsms.girl.pojo.Girl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErgodicTest {

    @Test
    public void testErgodic() {
        Girl girl1 = new Girl("yang", "shi", 1);
        Girl girl2 = new Girl("yang", "sheng", 10);
        Girl girl3 = new Girl("shi", "sheng", 100);

        List<Girl> girls = new ArrayList<>();
        girls.add(girl1);
        girls.add(girl2);
        girls.add(girl3);

        System.out.println("下面是List遍历");
//        遍历List
        System.out.println(girls);
        for (Girl girl : girls) {
            System.out.println(girl);
        }
        System.out.println("下面是Map遍历");

        Map<Integer, Girl> map = new HashMap<>();
        map.put(1, girl1);
        map.put(2, girl2);
        map.put(3, girl3);
        System.out.println(map.size());
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().toString());
        }

        for (Integer integer : map.keySet()) {
            System.out.println(integer);

        }

        for (Girl girl : map.values()) {
            System.out.println(girl.getName());
        }

        System.out.println(map.get(0));
    }

}