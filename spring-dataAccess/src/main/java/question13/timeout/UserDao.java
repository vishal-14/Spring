package question13.timeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(timeout = 2)
    public void insert() {
        try {
            Thread.sleep(10000l);
            String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
            jdbcTemplate.update(sql, new Object[]{
                    "ninja", "rishabh", "Rishabh", 19, new Date(100, 1, 14)
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
