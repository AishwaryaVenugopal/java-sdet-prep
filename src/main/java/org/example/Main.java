package org.example;

import day01_02.APITest;
import day01_02.Employee;
import day01_02.LoginTest;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        /*emp1.name = "Sai";
        emp1.ID = 111;
        emp1.salary = 90000;*/

        /*-----ENCAPSULATION-----*/
        emp1.testSalary = -5000;
        emp1.setName("Gabriel");
        emp1.setID(112);
        emp1.setSalary(91000);
        emp1.displayDetails();

        LoginTest login = new LoginTest();
        login.openBrowser();
        login.setUsername("Micheal");
        System.out.println("Login Username: " +login.getUsername());

        APITest apiTest = new APITest();
        apiTest.getUser();
        apiTest.setUserName("Rapheal");
        System.out.println("API Username: " +apiTest.getUsername());

        /*-----STRINGS-----*/
        String s1 = "Hello";
        System.out.println(s1); //original string
        s1.concat("World");
        System.out.println(s1); //original string pointing to the intial reference
        s1 = s1.concat("World");
        System.out.println(s1); //new string pointing to new reference
        }
    }
