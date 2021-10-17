package baseline;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;

import java.util.Scanner;
public class productSearch {
    private static final Scanner in = new Scanner(System.in);
    String searchTerm ;
    public void readInput(String prompt){
        //prompts the user for a string
        System.out.println(prompt);
        //sets the word to  the user next line
        searchTerm =  in.nextLine();
    }

    public int search() throws IOException {
        JSONParser parser = new JSONParser();
        try{
            Object objectParser = parser.parse(new FileReader("data/exercise44_input.json"));
            JSONObject jsonObject = (JSONObject) objectParser;
            JSONArray values = (JSONArray) jsonObject.get("products");
            // parse the data to see if the input is equal to any of the names
            Iterator<JSONObject > iterator = values.iterator();
            //done by doing a while loop for terms in the input file
            while(iterator.hasNext()){
                JSONObject json = iterator.next();
                Object name =  json.get("name");
                Object price = json.get("price");
                Object quantity = json.get("quantity");
                if(searchTerm.equals(name)){
                    // get all the data and print it
                    // print them out
                    System.out.printf("Name: %s%n", name);
                    System.out.printf("Price: %s%n", price);
                    System.out.printf("Quantity: %s%n", quantity);
                    // return 1
                    return 1;
                }
            }
            //use a catch loop so it will run
        } catch (ParseException thing) {
            thing.printStackTrace();
        }
        //if the input is not there
        // print a statement saying it is not here and return 0
        System.out.printf("Sorry that was not found in our inventory%n");
        return 0;
    }

}
