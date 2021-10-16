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
        //prompts user
        String site = fM.readInput("Site name: ");
        //sets name
        fM.setSiteName(site);
        //prompts user
        String author = fM.readInput("Author: ");
        //sets name
        fM.setAuthorName(author);
        //prompts user
        String javaScript = fM.readInput("Do you want a folder for JavaScript? ");
        //sets name
        fM.setJavaScript(javaScript);
        //prompts user
        String CSS = fM.readInput("Do you want a folder for CSS? ");
        //sets name
        fM.setCSS(CSS);
        //call the website function creator
        fM.createFiles();

    }
}
