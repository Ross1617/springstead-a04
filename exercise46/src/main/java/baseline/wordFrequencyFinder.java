package baseline;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class wordFrequencyFinder {
    //create instance variable of array List to hold input
    ArrayList<String> words = new ArrayList<String>();
    //instance variable of the amount of certain words
    //badger
    int badger = 0;
    //mushroom
    int mushroom = 0;
    //snake
    int snake = 0;
    public ArrayList<String> readInput(String filename) throws FileNotFoundException {
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
    public int findFrequency(){
        //goes throught the array list
        //increases every time badger shows up
        String line;
        for (int i = 0; i< words.size(); i++)
        {
            //goes through each line of the array list
            line = words.get(i);
            //splits each word up
            String word[] = line.split(" ");
            //sets the word if it is there
            for (int j =0; j < word.length; j++){
                if(word[j].equals("badger")){
                    badger++;
                }
                if(word[j].equals("mushroom")){
                    mushroom++;
                }
                if(word[j].equals("snake")){
                    snake++;
                }
            }
        }

        //adds up all the number s
        int total = badger + mushroom+snake;
        //returns the number
        return total;
    }
    public void displaysOutput(){
        //adds the three numbers into an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(badger);
        numbers.add(snake);
        numbers.add(mushroom);
        System.out.printf("%n%n",numbers.get(0));
        //sorts them by greatest to least
        Collections.sort(numbers);
        Collections.reverse(numbers);
        String theWord = "";
        //prints the name and the amount
        for (int i = 0; i < numbers.size() ; i++ ){
            if (numbers.get(i) == badger){
                theWord = "badger:";
            }
            else if(numbers.get(i) == snake){
                theWord = "snake:";
            }
            else if(numbers.get(i) == mushroom){
                theWord = "mushroom:";

            }
            System.out.printf("%-12s",theWord);
            //prints * for the amount they show up
            for(int j = 0; j < numbers.get(i); j++){
                String wow = "*";
                System.out.printf("%s",wow);
            }
            System.out.printf("%n");
        }

    }

}
