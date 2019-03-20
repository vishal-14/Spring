package question12.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(){
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "ninja2", "rishabh2", "Rishabh2", 29, new Date(100,1,14)
        });
    }
}
