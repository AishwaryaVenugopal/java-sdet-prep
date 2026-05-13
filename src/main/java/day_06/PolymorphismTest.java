package day_06;

public class PolymorphismTest {
    public void postAPI () {
        System.out.println("Sending Payload in JSON");
    }
    public void postAPI (String requestType) {
        System.out.println("Sending Payload in " +requestType);
    }

    public static void main(String[] args) {
        PolymorphismTest test = new PolymorphismTest();
        test.postAPI();
        test.postAPI("XML");
    }
}

