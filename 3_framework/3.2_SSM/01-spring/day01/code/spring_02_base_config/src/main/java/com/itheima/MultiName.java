package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiName {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        id="bookService" name="service service4 bookEbi"
        String id = "bookService";
        String name = "bookEbi";
        BookService  bookService = (BookService) ctx.getBean(id);
        bookService.save();
    }
}
