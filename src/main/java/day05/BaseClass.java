package day05;

public class BaseClass {
    public String language = "Java";
    private String password = "secret";
    protected String driver = "webdriver";
    String defaultParameter = "defaultParameter";

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }

    public String getDefaultParameter() {
        return defaultParameter;
    }
}
