package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/*Question 3:
* Create a class Restaurant. Create an interface HotDrink with an abstract method
* prepareHotDrink. Create two classes Tea and ExpressTea which implements HotDrink Class.
* Create an instance variable of type HotDrink in Restaurant class.
* */
interface HotDrink{
    void prepareHotDrink();
}

class Tea implements HotDrink{
    @Override
    public void prepareHotDrink() {
        System.out.println("Serving Tea");
    }
}

class ExpressTea implements HotDrink{
    @Override
    public void prepareHotDrink() {
        System.out.println("Serving Express Tea");
    }
}
@Component    //Q10) use @component
@Controller   //Q10) use @Controller
@Repository //Q10) use @Repository
public class Restaurant {
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
    //@Required //Q8) Use @Required annotation for hotDrink setter method in com.spring.Restaurant class.
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Autowired
    //Q9)Use @Autowired annotation to wire com.spring.Tea with com.spring.Restaurant class Using setter method,
// field and constructor.
    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
