package com.spring.bootDemo;
/*
Question 2
Three methods are:

1. Run the Main java class marked with @SpringBootApplication Annotation
and contains main.
2.Execute the bootRun Gradle tasks
3.Create an Executable jar with the help of bootJar Gradle task.
This task will build an executable jar inside build/libs folder.
Run jar using:
java -jar <jar name>
*/

import com.spring.bootDemo.entity.Database;
import com.spring.bootDemo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    Database database;
    Logger logger = LoggerFactory.getLogger(Application.class); //Apply logging
    @Value("${spring.application.name}") //Accessing values through application.properties
    private String appName;
    @Value("${database.name}")
    private String name;
    @Value("${database.port}")
    private int port;

    @Bean
    public void database() {      //database bean
        database = new Database(port, name);

    }

    @RequestMapping("/display")
    public String display() {
        /*Apply Logging whereever you feel is necessity*/
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "<br>Application: " + appName + "<br>" + database;
    }

    @Bean
    public User user() {      // user bean
        User user = new User();
        user.setUsername("username1");
        user.setPassword("password1");
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
