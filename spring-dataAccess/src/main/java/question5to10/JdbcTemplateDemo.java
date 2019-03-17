package question5to10;

/**
 * Use JdbcTemplate to get the count of users
 * Get name of the user by providing username to the parametrized query
 * Insert one record using JdbcTemplate
 * Use QueryForMap to fetch the user details of the  user
 * Use QueryForList to fetch records of all users
 * Use a rowmapper to get the User object when you query for a user
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class JdbcTemplateDemo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("ques5to10.xml");
        UserDao userDao = apx.getBean(UserDao.class);

        //Question 5
        userDao.userCount();

        //Question 6
        System.out.println("Name : " + userDao.getUserName());

        //Question 7
        User user = new User();
        user.setUsername("incredible");
        user.setName("Shailendra");
        user.setPassword("shukla");
        user.setAge(29);
        user.setDob(new Date(89, 7, 2));

        userDao.insertUser(user);

        //Question 8
        userDao.getUserNameByAge();

        //Question 9
        userDao.getUserDetail();

        //Question 10
        User user1 = userDao.getUser();
        System.out.println(user1.getName());

    }
}
