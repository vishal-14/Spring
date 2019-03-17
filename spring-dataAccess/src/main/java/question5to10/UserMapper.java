package question5to10;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        user.setPassword(rs.getString("password"));
        user.setUsername(rs.getString("username"));
        user.setDob(rs.getDate("dob"));
        return user;
    }
}
