package question11;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    SessionFactory sessionFactoryBean;

    public void userData() {
        String sql = "SELECT count (*) FROM user";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println("No. of users are: " + query.uniqueResult());
    }
}
