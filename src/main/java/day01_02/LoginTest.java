package day01_02;

public class LoginTest {
    private String username;
    public void openBrowser (){
        System.out.println("Browser Opening");
    }
    public void setUsername (String username) {
        this.username = username;
    }
    public String getUsername () {
        return username;
    }
}
