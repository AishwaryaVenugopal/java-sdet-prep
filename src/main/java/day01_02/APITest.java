package day01_02;

public class APITest {
    private String userName;
    public void getUser() {
        System.out.println("Getting User");
    }
    public void setUserName (String userName) {
        this.userName = userName;
    }
    public String getUsername () {
        return userName;
    }
}
