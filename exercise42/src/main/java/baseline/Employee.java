package baseline;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//imports scanner
//import all the stuff about reading files
public class Employee {
    //creates an instance variable of ArrayList that holds all the information
    ArrayList<String> information = new ArrayList<String>();

    public ArrayList<String> readNames(String filename) throws FileNotFoundException {
        //opens input file
        //reads in the file names from the string provided
        File text = new File(filename);
        Scanner input =  new Scanner(text);
        while(input.hasNextLine()) {
            //adds the names to the array list
            information.add(input.nextLine());
        }
        //returns information for testing purposes
        //close the scanner
        input.close();
        return information;
    }
    public ArrayList<String> displayEmployees(){
        //takes the array list and is designed to print it
        //creates a new array list
        int size = information.size();
        //prints a header
        System.out.printf("Last            First           Salary%n");
        System.out.printf("--------------------------------------%n");
        // looks through each line
        String holder ;
        for (int i = 0; i < size; i++) {
            //after every word creates spacing
            holder = information.get(i);
            //done by parsing through
            String lineOfEmployee[] = holder.split(",");
            //prints the new modify line
            System.out.printf("%-15s %-15s %-15s%n", lineOfEmployee[0], lineOfEmployee[1], lineOfEmployee[2]);
            //adds new line to new array list
        }
        //returns the array list
        return information;
    }
}
