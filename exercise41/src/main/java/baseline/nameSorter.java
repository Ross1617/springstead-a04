package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class nameSorter {
    //create an instance variable of array list of the names
    ArrayList<String> names = new ArrayList<String>();

    public ArrayList<String> readNames(String filename)throws FileNotFoundException{
        //opens input file
        //reads in the file names from the string provided
        File text = new File(filename);
        Scanner input =  new Scanner(text);
        while(input.hasNextLine()) {
            //adds the names to the array list
            names.add(input.nextLine());
        }
        //returns names for testing purposes
        return names;
    }
    public ArrayList<String> sortNames(){
        //takes the array list and uses sort in the library
        Collections.sort(names);
        //used for testing
        return names;
    }
    public ArrayList<String> writeNames(String filename) throws IOException {
        //opens output file
        FileWriter text = new FileWriter(filename);
        //takes array list and writes it to a file
        for(int i =0; i< names.size(); i++){
            text.write(String.valueOf(names.get(i)));
            text.write("\n");
        }
        //closes the file
        text.close();
        return names;
    }


}

