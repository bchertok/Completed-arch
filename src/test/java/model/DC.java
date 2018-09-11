package model;


public class DC {

    private String name;
    private String password;

    public DC withname(String name) {
        this.name = name;
        return this;
    }

    public DC withpassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
