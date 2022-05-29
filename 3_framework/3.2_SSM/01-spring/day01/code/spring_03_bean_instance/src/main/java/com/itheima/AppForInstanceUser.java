package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import com.itheima.factory.OrderDaoFactory;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        //创建实例工厂对象
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        //通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        传统方法
        UserDao userDao1 = (UserDao) ctx.getBean("userDaoInstance");
        UserDao userDao2 = (UserDao) ctx.getBean("userDaoInstance");
        System.out.println(userDao1);
        System.out.println(userDao2);
//        userDao.save();

//        推荐方法
        UserDao userDaoNew = (UserDao) ctx.getBean("userDao");
        userDaoNew.save();


    }
}
