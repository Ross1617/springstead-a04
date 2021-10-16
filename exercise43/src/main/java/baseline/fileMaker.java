package baseline;
import java.util.Scanner;
import java.io.*;
public class fileMaker {
    private static final Scanner in = new Scanner(System.in);
    // has 4 instance variables
    // site name
    String siteName;
    // author
    String authorName;
    //javaScript
    String javaScript;
    //CSS
    String  CSS;
    public String readInput(String prompt){
        //prompts the user for a string
        System.out.println(prompt);
        //returns the user next line
        return in.nextLine();
    }
    public String setSiteName(String input) {
        //sets the site name to the instance variable
        siteName = input;
        //returns site name
        return siteName;

    }
    public  String setAuthorName(String input) {
        //sets the author name to the instance variable
        authorName = input;
        //return so a test case can be made
        return  authorName;
    }

    public String setJavaScript(String input) {
        //set the instance variable
        javaScript = input;
        //return so a test case can be made
        return javaScript;
    }
    public String setCSS(String input){
        //set the instance variable
        CSS = input;
        //return so a test case can be made
        return CSS;
    }

    public int createFiles() throws IOException {
        //get the current path of the user
        //assign it to a variable
        int counter = 0;
        String created = "Created ";
        String path = System.getProperty("user.dir");
        //add the site name to the variable
        path += "\\" + siteName;
        File website = new File(path);
        //print out the location
        boolean websiteCreated = website.mkdir();
        if(websiteCreated){
            System.out.println(created + path);
            counter++;
        }
        //write to the file the html needed
        try (FileWriter websiteSkeleton = new FileWriter(new File(path + "\\index.html"))){
            //make sure it has a title and the author
            //found format from online
            websiteSkeleton.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            //making meta author
            websiteSkeleton.write("\t<meta author=\"" + authorName + "\">\n");
            //making title
            websiteSkeleton.write("\t<title>" + siteName + "</title>\n");
            websiteSkeleton.write("</head>\n<body>\n\n</body>\n</html>");
            //print the  location
            System.out.println(created + path + "\\index.html");
            counter++;
            //check to see if javaScript is equal to y
            if (javaScript.equals("y")) {
                //if yes create a new folder for it
                File javaScriptFolder = new File(path + "\\js");
                //print where it is located
                boolean javaScriptCreated = javaScriptFolder.mkdir();
                if(javaScriptCreated){
                    System.out.println(created + javaScriptFolder + "\\");
                    counter++;
                }

            }
            //check to see if CSS is y
            if (CSS.equals("y")) {
                //if yes create a new folder for it
                File CSSFolder = new File(path + "\\css");
                //if yes create a new folder for it
                boolean CSSCreated = CSSFolder.mkdir();
                if ( CSSCreated){

                    //print where it is located
                    System.out.println(created + CSSFolder + "\\");
                    counter++;
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Something did not work");
        }
        return counter;
    }



}
