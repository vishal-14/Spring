package question1;

import org.springframework.context.ApplicationEventPublisher;
import question3.CustomEvent;

public class Database {
    private int port;
    private String name;
    ApplicationEventPublisher applicationEventPublisher;
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
