package question12.nested;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ques12.xml");
        UserDao1 userDao= ctx.getBean("dao5", UserDao1.class);
        userDao.insert();
    }

}