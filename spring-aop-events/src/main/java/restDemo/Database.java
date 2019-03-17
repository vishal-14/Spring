package restDemo;

import java.io.IOException;

public class Database {
    int port;
    String name;

    public void setPort(int port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPort() {
        return port;
    }

    void connect() {
        System.out.println("Connecting to " + this.getName() + " on port " + this.getPort());
    }

    void willThrowException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void someDatabaseMethod(int someInt) {
        System.out.println("This method takes an int");
    }

    int someIntMethod(int someInt) {
        System.out.println("This method takes an int and returns an int");
        return 1;
    }

}
