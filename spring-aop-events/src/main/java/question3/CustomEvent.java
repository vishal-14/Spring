package question3;

import org.springframework.context.ApplicationEvent;

/**
 * Question 3: Create a CustomEvent which should get published when you invoke
 * connect method of database bean.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
}
