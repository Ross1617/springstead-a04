package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ross Springstead
 */


import java.io.IOException;

public class Solutions43 {
    public static void main(String[] args) throws IOException {
        //create a new instance of fileMaker
        fileMaker fM = new fileMaker();
        //calls the function that asks the users all the questions
        // getUserInformation
        fM.getUserInformation();
        //call the website function creator
        fM.createFiles();

    }
}
