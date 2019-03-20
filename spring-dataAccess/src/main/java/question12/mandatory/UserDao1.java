package question12.mandatory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao2 userDao2;

    public void insert(){
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "ninja", "rishabh", "Rishabh", 19, new Date(100,1,14)
        });

        userDao2.insert();
    }
}
