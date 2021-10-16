package baseline;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyFinderTest {
    wordFrequencyFinder wF = new wordFrequencyFinder();
    @Test
    public void test_read() throws FileNotFoundException {
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual;
        expected.add("badger badger badger ");
        expected.add("badger mushroom ");
        expected.add("mushroom snake badger badger ");
        expected.add("badger");
        actual = wF.readInput("data/exercise46_input.txt");
        assertEquals(actual,expected);
    }
    @Test
    public void findFrequency(){
        int expectedNumber= 10;
        int actual;
        wF.words.add("badger badger badger ");
        wF.words.add("badger mushroom ");
        wF.words.add("mushroom snake badger badger ");
        wF.words.add("badger");
        actual = wF.findFrequency();
        assertEquals(actual,expectedNumber);
    }



}