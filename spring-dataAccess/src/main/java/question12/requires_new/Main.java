package question12.requires_new;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ques12.xml");
        UserDao1 userDao= ctx.getBean("dao3", UserDao1.class);
        userDao.insert();
    }

}