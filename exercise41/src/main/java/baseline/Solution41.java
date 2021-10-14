/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */
//changed my psudecode a bit because i messed up where i need to call scanner and file
package baseline;


//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution41 {

    public static void main(String[] args) throws IOException {
        //create a new initiation of nameSorter
        nameSorter ns = new nameSorter();
        //calls the readInput function
        ns.readNames("data/exercise41_input.txt");
        //calls the sortNames function
        ns.sortNames();
        //calls the writeName function
        ns.writeNames("data/exercise41_output.txt");

    }
}
