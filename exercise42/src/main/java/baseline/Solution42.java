/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;

import java.io.FileNotFoundException;

public class Solution42 {
    public static void main(String[] args) throws FileNotFoundException {
        //creates a new instance of class Employee
        Employee emp = new Employee();
        //calls the read file function in Employee with the paramater of the doc file
        emp.readNames("data/exercise42_input.txt");
        //calls the displayEmployees function
        emp.displayEmployees();
    }
}
