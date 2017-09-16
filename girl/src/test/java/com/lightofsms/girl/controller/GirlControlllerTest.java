package com.lightofsms.girl.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class GirlControlllerTest {
    @Resource
    private MockMvc mvc;
    @Test
    public void add() throws Exception {
    }

    @Test
    public void getGirls() throws Exception {
    }

    @Test
    public void getGirl() throws Exception {
    }

}