package day_06;

public class ChromeDriver extends WebDriver {

    @Override
    public void webDriverImplementation() {
        System.out.println("Opening Chrome Driver");
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.webDriverImplementation();
    }
}
