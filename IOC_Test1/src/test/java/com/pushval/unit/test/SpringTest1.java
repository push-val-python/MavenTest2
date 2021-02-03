package com.pushval.unit.test;

import com.pushval.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
    @Test
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao o1 = (UserDao) app.getBean("userDao");
        UserDao o2 = (UserDao) app.getBean("userDao");
        System.out.println(o1);
        System.out.println(o2);
    }
}
