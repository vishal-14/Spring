package question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config1.xml");
        /**
         * Question 1: Invoke context events start(), stop() and close()
         */
        ((ClassPathXmlApplicationContext) applicationContext).start();
        Database database = applicationContext.getBean(Database.class);
        System.out.println(database);
        ((ClassPathXmlApplicationContext) applicationContext).stop();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
