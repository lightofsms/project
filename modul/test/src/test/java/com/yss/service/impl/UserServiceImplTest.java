package com.yss.service.impl;

import com.yss.pojo.User;
import com.yss.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void save() throws Exception {

        String[] name1 = new String[]{"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈"};
        String[] names2 = new String[]{"强", "亚", "哲", "凡", "路", "举", "昕", "科", "武", "田"};

        String username = "";

        Random random = new Random();

        Map<String, String> map = new HashMap<>();
        Set<String> setName = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            String name3 = "";

            int n = random.nextInt(3);
            System.out.println(n);
            if (n == 1) {
                name3 = names2[random.nextInt(names2.length)];
            }
            username = name1[random.nextInt(name1.length)] + names2[random.nextInt(names2.length)] + name3;
            System.out.println(username);

            String passwd = "";

            for (int j = 0; j < 6; j++) {
                passwd += random.nextInt(10);
            }


            map.put(username, passwd);


        }

        System.out.println(map);


        for (Map.Entry entry : map.entrySet()) {
            System.out.println("用户名:" + entry.getKey() + "  密码:" + entry.getValue());

            userService.save(new User((String) entry.getKey(), (String) entry.getValue()));
        }


    }

}