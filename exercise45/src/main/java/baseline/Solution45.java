/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        //creates a new instance of class wordFinder
        wordFinder wF = new wordFinder();
        //calls fileReader
        wF.readStory("data/exercise45_input.txt");
        //calls outputWriter
        wF.writeStory("data/exercise45_output.txt");

    }
}
