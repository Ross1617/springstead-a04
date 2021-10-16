package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordFinder {
    //array list that holds all the words
    ArrayList<String> words = new ArrayList<String>();

    public ArrayList<String> readStory(String filename) throws FileNotFoundException {
        //opens input file
        //reads in the file names from the string provided
        File text = new File(filename);
        Scanner input = new Scanner(text);
        while (input.hasNextLine()) {
            //adds the names to the array list
            words.add(input.nextLine());
        }
        //returns names for testing purposes
        //close the scanner
        input.close();
        return words;
    }

    public ArrayList<String> writeStory(String filename) throws IOException {
        //opens output file
        //creats new array list
        ArrayList<String> things = new ArrayList<String>();
        // uses try to open the file
        try (FileWriter text = new FileWriter(filename)) {
            for (int i = 0; i < words.size(); i++) {
                // goes through every word
                String s1 = words.get(i);
                // if the word is equal to utilize replace it
                String replaceString = s1.replace("utilize", "use");
                //writes it to the output
                text.write(replaceString);
                text.write("\n");
                //write the word to the new array list
                things.add(replaceString);
                things.add("\n");
            }
        }
        //returns the new array list
        return things;

    }
}

