package question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Integrate Hibernate with Spring and
 * use sql query to count the number of records in user table.
 */
public class ORMdemo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("ques11.xml");
        UserDao user = apx.getBean(UserDao.class);
        user.userData();
    }
}