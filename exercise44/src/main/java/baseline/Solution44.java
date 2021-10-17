/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */

package baseline;

import java.io.IOException;

public class Solution44 {
    public static void main(String[] args) throws IOException {
        productSearch pS = new productSearch();
        //create a counter that is = 0
        int holder = 0;
        //while loop that runs until counter is not 0
        while(holder ==0){
            //ask for the user input by calling readInput
            pS.readInput("What is the products name? ");
            //call search function with the input
            //if an item was found change counter to 1
            holder  = pS.search();
        }
    }
}
