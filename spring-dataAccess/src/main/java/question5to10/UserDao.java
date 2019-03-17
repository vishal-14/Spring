package question5to10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //Question 5
    public void userCount() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }

    //Question 6
    public String getUserName() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"CaptainA"}, String.class);
    }

    //Question 7
    public void insertUser(User user) {
        String sql = "INSERT INTO user (username,password,name,age,dob)"
                + "VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getDob()
        });
    }

    //Question 8
    public void getUserNameByAge() {
        String sql = "SELECT name FROM user WHERE age = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{29}));
    }

    //Question 9
    public void getUserDetail() {
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }

    //Question 10
    public User getUser() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"CaptainA"}, new UserMapper());
    }

}
