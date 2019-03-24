package com.spring.bootDemo.entity;
/*Create a Bean Database with two fields port and name and
Access its values using application.properties */
public class Database {
    private int port;
    private String name;

    public Database(int port, String name) {
        this.port = port;
        this.name = name;
    }

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
