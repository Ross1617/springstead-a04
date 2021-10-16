/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;

import java.io.FileNotFoundException;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        //creates new instance of wordFrequencyFinder
        wordFrequencyFinder wF = new wordFrequencyFinder();
        //calls readInput
        wF.readInput("data/exercise46_input.txt");
        // calls findFrequency
        wF.findFrequency();
        //calls displaysOutput
        wF.displaysOutput();

    }
}
