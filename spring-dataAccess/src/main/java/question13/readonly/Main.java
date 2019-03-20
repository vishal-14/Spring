package question13.readonly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ques13.xml");
        UserDao userDao= ctx.getBean("InsertUserReadOnly", UserDao.class);
        userDao.insert();
    }

}