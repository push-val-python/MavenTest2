package com.pushval.unit.test;

import com.pushval.tests.SayableCaller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    @Test
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        SayableCaller sayableCaller = (SayableCaller) app.getBean("sayableCaller");
        sayableCaller.say();
    }
}
