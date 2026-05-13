package day_05_NewPackage;

import day05.BaseClass;

public class TestClass extends BaseClass {
    public void testmethod () {
        System.out.println("The language is: " +language); //public
        System.out.println("The password is: " +getPassword()); //private
        System.out.println("Opening driver: " +driver); //protected
        System.out.println("Printing default modifier variable: " +getDefaultParameter());//default can be accessed only by getter method
    }
    public static void main(String[] args) {
        day05.TestClass tc = new day05.TestClass();
        tc.testmethod();
    }
}
