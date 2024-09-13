package com.driver;


public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of RWOnly class
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to the private member variable directly
        // obj.name = "John";  // Error: 'name' has private access in RWOnly

        // Task 4: Try printing the value directly
        // System.out.println(obj.name);  // Error: 'name' has private access in RWOnly
        obj.setName("vijay");
        obj.getName();
        ///adederds ectere thingb
    }
}
