package demo;

//Question 1
//    Create a class Database with 2 instance variables port and name.
public class DatabaseDB {
    private Integer port;
    private String name;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
        //System.out.println("Variables Initialized");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "demo.DatabaseDB{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}


