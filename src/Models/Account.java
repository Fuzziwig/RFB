package Models;

public abstract class Account {
    private String username, user_pass;


    public Account(String username, String user_pass) {
        this.username = username;
        this.user_pass = user_pass;
    }
    public Account(){}

    public String getUser() {
        return username;
    }

    public String getPassword() {
        return user_pass;
    }
}
