package com.baizhi.test;


import com.baizhi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main1(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        //System.out.println(userServiceImpl.selectAll());
        System.out.println(userServiceImpl.selectAll(1, 10, null));

    }

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("牧壳");
    }
    public static  void pong(){
        System.out.println("科技");
    }
}
