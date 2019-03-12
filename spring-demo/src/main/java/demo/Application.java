package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

    /*Question 2:Get the bean of the class from spring container and
    print the values of the instance variable.*/
        DatabaseDB databaseDB = applicationContext.getBean("db", DatabaseDB.class);
        System.out.println(databaseDB);
    /*Question 4
    * Get both the beans and invoke prepareHotDrink method via hotDrink
    instance variables. Try inner bean with expressTeaRestaurant.*/
        Restaurant restaurant = applicationContext.getBean("teaRestaurant", Restaurant.class);
        restaurant.hotDrink.prepareHotDrink();

        Restaurant restaurant1= applicationContext.getBean("expressTeaRestaurant",Restaurant.class);
        restaurant1.hotDrink.prepareHotDrink();
        /*Question 6 Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.*/
        Restaurant tea1 = (Restaurant) applicationContext.getBean("res");
        tea1.getHotDrink().prepareHotDrink();
        Restaurant tea2 = (Restaurant) applicationContext.getBean("res1");
        tea2.getHotDrink().prepareHotDrink();
        Restaurant tea3 = (Restaurant) applicationContext.getBean("res3");
        tea3.getHotDrink().prepareHotDrink();

        /*Question 7 Set the scope of the teaRestaurant1 bean as prototype and
        check the scope type after accessing the bean.*/
        Restaurant restaurant2 = applicationContext.getBean("teaRestaurant1",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println("Scope is Prototype? "+ applicationContext.isPrototype("teaRestaurant1"));


    }
}
