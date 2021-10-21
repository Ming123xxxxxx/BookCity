package dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BookService;
import service.BookServiceImpl;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/21 11:29
 */
public class MTest {

    @Test
    public void t1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");

        for(Books books:bookServiceImpl.queryBookAll()){
            System.out.println(books);
        }
    }
}
