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
    char javaScript;
    //CSS
    char CSS;

    public void getUserInformation(){

        //prompt the user for site name
        System.out.println("Site name : ");
        //sets the site name to the instance variable
        siteName = in.nextLine();
        //prompt the user for the author
        System.out.println("Author name : ");
        //sets the author name to the instance variable
        authorName = in.nextLine();
        // prompt the user for if he wants JavaScript files
        System.out.println("Do you want a folder for JavaScript? ");
        //set the instance variable
        javaScript = in.next().charAt(0);
        //prompt the user if he wants a CSS file
        System.out.println("Do you want a folder for CSS? ");
        //set the instance variable
        CSS = in.next().charAt(0);
    }

    public void createFiles() throws IOException {
        //get the current path of the user
        //assign it to a variable
        String created = "Created ";
        String path = System.getProperty("user.dir");
        //add the site name to the variable
        path += "\\" + siteName;
        File website = new File(path);
        //print out the location
        boolean websiteCreated = website.mkdir();
        if(websiteCreated){
            System.out.println(created + path);
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
            websiteSkeleton.close();
            //print the  location
            System.out.println(created + path + "\\index.html");

            //check to see if javaScript is equal to y
            if (javaScript == 'y') {
                //if yes create a new folder for it
                File javaScriptFolder = new File(path + "\\js");
                //print where it is located
                boolean javaScriptCreated = javaScriptFolder.mkdir();
                if(javaScriptCreated){
                    System.out.println(created + javaScriptFolder + "\\");
                }

            }
            if (CSS == 'y') {
                //if yes create a new folder for it
                File CSSFolder = new File(path + "\\css");
                //print where it is located
                boolean CSSCreated = CSSFolder.mkdir();
                if ( CSSCreated){
                    System.out.println(created + CSSFolder + "\\");
                }
            }
            //check to see if CSS is y
            //if yes create a new folder for it
            //print where it is located
            websiteSkeleton.close();

        }
        catch(IOException e)
        {
            System.out.println("Something did not work");
        }


    }

}
