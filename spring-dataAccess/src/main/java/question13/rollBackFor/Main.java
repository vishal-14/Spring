package question13.rollBackFor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ques13.xml");
        UserDao userDao= ctx.getBean("InsertUserRollBackfor", UserDao.class);
        userDao.insert();
    }

}