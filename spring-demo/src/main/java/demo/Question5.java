package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

class Complex {
    List<Integer> list;
    Set<Integer> set;
    Map<Integer, String> map;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}

public class Question5 {
    public static void main(String[] args) {
        /*Question 5 Get the bean and display the properties.*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("complex-config.xml");
        Complex complex = applicationContext.getBean("complexBean",Complex.class);
        System.out.println(complex.getList());
        System.out.println(complex.getSet());
        System.out.println(complex.getMap());

    }
}
