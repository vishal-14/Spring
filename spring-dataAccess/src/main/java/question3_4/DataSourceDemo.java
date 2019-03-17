package question3_4;
/**
 *  Use datasource with DriverManagerDataSource, dbcp2.BasicDataSource and
 * SingleConnectionDataSource to print the records of user tables
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSourceDemo {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("ques3_4.xml");
    DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
    DataSource dataSource1 =ctx.getBean("dataSource1", DataSource.class);
    DataSource dataSource2 =ctx.getBean("dataSource2", DataSource.class);

    public void print1() throws SQLException {
        PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Names of users");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    public void print2() throws SQLException {
        PreparedStatement preparedStatement = dataSource1.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Age of users");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("age"));
        }
    }

    public void print3() throws SQLException {
        PreparedStatement preparedStatement = dataSource2.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Usernames of users");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
    }

    public static void main(String[] args) throws SQLException {
        DataSourceDemo dataSourceDemo = new DataSourceDemo();
        dataSourceDemo.print1();
        dataSourceDemo.print2();
        dataSourceDemo.print3();
    }
}