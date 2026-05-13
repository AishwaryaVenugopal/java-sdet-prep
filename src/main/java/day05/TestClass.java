package day05;

public class TestClass extends BaseClass {
    public void testmethod () {
        System.out.println("The language is: " +language); //public
        System.out.println("The password is: " +getPassword()); //private
        System.out.println("Opening driver: " +driver); //protected
        System.out.println("Printing default modifier variable: " +defaultParameter);//default
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.testmethod();
    }
}
